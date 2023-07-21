/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemahospital.persistencia;

import com.mycompany.sistemahospital.logica.PacienteSC;
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
public class PacienteSCJpaController implements Serializable {

    public PacienteSCJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;
    public PacienteSCJpaController() {
        emf = Persistence.createEntityManagerFactory("SistemaHospitalarioPU");
    }
    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(PacienteSC pacienteSC) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(pacienteSC);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(PacienteSC pacienteSC) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            pacienteSC = em.merge(pacienteSC);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = pacienteSC.getId();
                if (findPacienteSC(id) == null) {
                    throw new NonexistentEntityException("The pacienteSC with id " + id + " no longer exists.");
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
            PacienteSC pacienteSC;
            try {
                pacienteSC = em.getReference(PacienteSC.class, id);
                pacienteSC.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The pacienteSC with id " + id + " no longer exists.", enfe);
            }
            em.remove(pacienteSC);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<PacienteSC> findPacienteSCEntities() {
        return findPacienteSCEntities(true, -1, -1);
    }

    public List<PacienteSC> findPacienteSCEntities(int maxResults, int firstResult) {
        return findPacienteSCEntities(false, maxResults, firstResult);
    }

    private List<PacienteSC> findPacienteSCEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(PacienteSC.class));
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

    public PacienteSC findPacienteSC(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(PacienteSC.class, id);
        } finally {
            em.close();
        }
    }

    public int getPacienteSCCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<PacienteSC> rt = cq.from(PacienteSC.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
