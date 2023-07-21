/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemahospital.persistencia;

import com.mycompany.sistemahospital.logica.PacienteTI;
import com.mycompany.sistemahospital.persistencia.exceptions.NonexistentEntityException;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

/**
 *
 * @author ledes
 */
public class PacienteTIJpaController implements Serializable {

    public PacienteTIJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;
    
    public PacienteTIJpaController() {
        emf = Persistence.createEntityManagerFactory("SistemaHospitalarioPU");
    }
    
    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(PacienteTI pacienteTI) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(pacienteTI);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(PacienteTI pacienteTI) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            pacienteTI = em.merge(pacienteTI);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = pacienteTI.getId();
                if (findPacienteTI(id) == null) {
                    throw new NonexistentEntityException("The pacienteTI with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(int id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            PacienteTI pacienteTI;
            try {
                pacienteTI = em.getReference(PacienteTI.class, id);
                pacienteTI.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The pacienteTI with id " + id + " no longer exists.", enfe);
            }
            em.remove(pacienteTI);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<PacienteTI> findPacienteTIEntities() {
        return findPacienteTIEntities(true, -1, -1);
    }

    public List<PacienteTI> findPacienteTIEntities(int maxResults, int firstResult) {
        return findPacienteTIEntities(false, maxResults, firstResult);
    }

    private List<PacienteTI> findPacienteTIEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(PacienteTI.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public PacienteTI findPacienteTI(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(PacienteTI.class, id);
        } finally {
            em.close();
        }
    }

    public int getPacienteTICount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<PacienteTI> rt = cq.from(PacienteTI.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
