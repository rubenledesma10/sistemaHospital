package com.mycompany.sistemahospital.logica;

import com.mycompany.sistemahospital.persistencia.ControladoraPersistencia;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.time.LocalDateTime;

public class ControladoraLogica {

    ControladoraPersistencia controlPersis = new ControladoraPersistencia();

    public void crearUsuario(String usuario, String contrasenia, String rol) {

        Usuario usu = new Usuario();
        usu.setUsuario(usuario);
        usu.setContrasenia(contrasenia);
        usu.setRol(rol);

        controlPersis.crearUsuario(usu);

    }

    public List<Usuario> traerUsuarios() {
        return controlPersis.traerUsuarios();
    }

    public void editarUsuario(Usuario user, String usuario, String contrasenia, String rol) {
        user.setUsuario(usuario);
        user.setContrasenia(contrasenia);
        user.setRol(rol);
        controlPersis.editarUsuario(user);
    }

    public Usuario traerUsuario(int idUsuario) {
        return controlPersis.traerUsuario(idUsuario);
    }

    public void borrarUsuario(int idUsuario) {
        controlPersis.borrarUsuario(idUsuario);
    }

    public Usuario validarUsuario(String usuario, String contrasenia) {
        Usuario usr = null;
        List<Usuario> listaUsuarios = controlPersis.traerUsuariosEnfemeros();
        for (Usuario usu : listaUsuarios) {
            if (usu.getUsuario().equals(usuario)) {
                if (usu.getContrasenia().equals(contrasenia)) {
                    usr = usu;
                    return usr;
                } else {
                    usr = null;
                    return usr;
                }
            } else {
                usr = null;
            }
        }
        return usr;
    }

    public List<PacienteSC> traerPacientesSC() {
        return controlPersis.traerPacientesSC();
    }

    public PacienteSC traerPacSC(int idPacSC) {
        return controlPersis.traerPacSC(idPacSC);
    }

    public void editarPacSC(PacienteSC pacSC, String observaciones) {
        pacSC.setObservaciones(observaciones);
        controlPersis.editarPacSC(pacSC);
    }

    public List<PacienteTI> traerPacientesTI() {
        return controlPersis.traerPacientesTI();
    }

    public PacienteTI traerPacTI(int idPacTI) {
        return controlPersis.traerPacTI(idPacTI);
    }

    public void editarPacTI(PacienteTI pacTI, String observaciones) {
        pacTI.setObservaciones(observaciones);
        controlPersis.editarPacTI(pacTI);
    }

    public void nuevoPacSC(String nombre, String apellido, String dni, int cama, String fechaIngreso, String observaciones) {
        PacienteSC pacSC = new PacienteSC();
        pacSC.setNombre(nombre);
        pacSC.setApellido(apellido);
        pacSC.setDni(dni);
        pacSC.setCama(cama);
        pacSC.setFechaIngreso(fechaIngreso);
        pacSC.setObservaciones(observaciones);
        controlPersis.nuevoPacSC(pacSC);
    }

    public void borrarPacSC(int idPacSC) {
        controlPersis.borrarPacSC(idPacSC);
    }

    public void editarPacSCMed(PacienteSC pacSC, String nombre, String apellido, String dni, int cama, String fecha, String observaciones) {
        pacSC.setNombre(nombre);
        pacSC.setApellido(apellido);
        pacSC.setDni(dni);
        pacSC.setCama(cama);
        pacSC.setFechaIngreso(fecha);
        pacSC.setObservaciones(observaciones);
        controlPersis.editarPacSCMed(pacSC);
    }   

    public void nuevoPacTI(String nombre, String apellido, String dni, int cama, String fecha, String observaciones) {
        PacienteTI pacTI = new PacienteTI();
        pacTI.setNombre(nombre);
        pacTI.setApellido(apellido);
        pacTI.setDni(dni);
        pacTI.setCama(cama);
        pacTI.setFechaIngreso(fecha);
        pacTI.setObservaciones(observaciones);
        controlPersis.nuevoPacTI(pacTI);
    }

    public void borrarPacTI(int idPacTI) {
        controlPersis.borrarPacTI(idPacTI);
    }

    public void editarPacTIMed(PacienteTI pacTI, String nombre, String apellido, String dni, int cama, String fecha, String observaciones) {
        pacTI.setNombre(nombre);
        pacTI.setApellido(apellido);
        pacTI.setDni(dni);
        pacTI.setCama(cama);
        pacTI.setFechaIngreso(fecha);
        pacTI.setObservaciones(observaciones);
        controlPersis.editarPacTIMed(pacTI);
    }

}
