
package com.mycompany.sistemahospital.persistencia;

import com.mycompany.sistemahospital.logica.PacienteSC;
import com.mycompany.sistemahospital.logica.PacienteTI;
import com.mycompany.sistemahospital.logica.Usuario;
import com.mycompany.sistemahospital.persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControladoraPersistencia {
    PacienteSCJpaController pacSCJpa = new PacienteSCJpaController();
    PacienteTIJpaController pacTIJpa = new PacienteTIJpaController();
    UsuarioJpaController usuJpa = new UsuarioJpaController();

    public void crearUsuario(Usuario usu) {
        usuJpa.create(usu);
    }

    public List<Usuario> traerUsuarios() {
        return usuJpa.findUsuarioEntities();
    }

    public void editarUsuario(Usuario user) {
        try {
            usuJpa.edit(user);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Usuario traerUsuario(int idUsuario) {
        return usuJpa.findUsuario(idUsuario);
    }

    public void borrarUsuario(int idUsuario) {
        try {
            usuJpa.destroy(idUsuario);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }  

    public List<Usuario> traerUsuariosEnfemeros() {
        List <Usuario> listaUsuario = usuJpa.findUsuarioEntities(); 
        return listaUsuario; 
    }

    public List<PacienteSC> traerPacientesSC() {
        return pacSCJpa.findPacienteSCEntities();
    }

    public PacienteSC traerPacSC(int idPacSC) {
        return pacSCJpa.findPacienteSC(idPacSC);
    }

    public void editarPacSC(PacienteSC pacSC) {
        try {
            pacSCJpa.edit(pacSC);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public List<PacienteTI> traerPacientesTI() {
        return pacTIJpa.findPacienteTIEntities();
    }

    public PacienteTI traerPacTI(int idPacTI) {
        return pacTIJpa.findPacienteTI(idPacTI);
    }

    public void editarPacTI(PacienteTI pacTI) {
        try {
            pacTIJpa.edit(pacTI);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void nuevoPacSC(PacienteSC nuevoPacSC) {
        pacSCJpa.create(nuevoPacSC);
    }

    public void borrarPacSC(int idPacSC) {
        try {
            pacSCJpa.destroy(idPacSC);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void editarPacSCMed(PacienteSC pacSC) {
        try {
            pacSCJpa.edit(pacSC);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void nuevoPacTI(PacienteTI pacTI) {
        pacTIJpa.create(pacTI);
    }

    public void borrarPacTI(int idPacTI) {
        try {
            pacTIJpa.destroy(idPacTI);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void editarPacTIMed(PacienteTI pacTI) {
        try {
            pacTIJpa.edit(pacTI);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
