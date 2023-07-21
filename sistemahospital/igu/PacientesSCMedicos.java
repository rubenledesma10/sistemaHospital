package com.mycompany.sistemahospital.igu;

import com.mycompany.sistemahospital.logica.ControladoraLogica;
import com.mycompany.sistemahospital.logica.PacienteSC;
import java.util.List;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class PacientesSCMedicos extends javax.swing.JFrame {
    ControladoraLogica control = new ControladoraLogica();
    public PacientesSCMedicos() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaPacientesSC = new javax.swing.JTable();
        btnNuevoPaciente = new javax.swing.JButton();
        btnEliminarPac = new javax.swing.JButton();
        btnRecargarTabla = new javax.swing.JButton();
        btnEditarPac = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setText("PACIENTES EN SALA COMÚN");

        tablaPacientesSC.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablaPacientesSC);

        btnNuevoPaciente.setText("INGRESAR PACIENTE");
        btnNuevoPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoPacienteActionPerformed(evt);
            }
        });

        btnEliminarPac.setText("DAR DE ALTA");
        btnEliminarPac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarPacActionPerformed(evt);
            }
        });

        btnRecargarTabla.setText("RECARGAR TABLA");
        btnRecargarTabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRecargarTablaActionPerformed(evt);
            }
        });

        btnEditarPac.setText("EDITAR PACIENTE");
        btnEditarPac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarPacActionPerformed(evt);
            }
        });

        btnVolver.setText("VOLVER");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 246, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(0, 63, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnRecargarTabla, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEditarPac, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEliminarPac, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnNuevoPaciente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnVolver, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnNuevoPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminarPac, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnEditarPac, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnRecargarTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        this.dispose();
        IntroSCOTIMedicos scOti = new IntroSCOTIMedicos();
        scOti.setVisible(true);
        scOti.setLocationRelativeTo(null);
        
    }//GEN-LAST:event_btnVolverActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        cargarTablaPacSC();
    }//GEN-LAST:event_formWindowOpened

    private void btnEditarPacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarPacActionPerformed
        if(tablaPacientesSC.getRowCount()>0){
            if(tablaPacientesSC.getSelectedRow()!=-1){
                int idPacSC = Integer.parseInt(String.valueOf(tablaPacientesSC.getValueAt(tablaPacientesSC.getSelectedRow(), 0)));
                EditarPacSCMed editarPacSCMed = new EditarPacSCMed(idPacSC);
                editarPacSCMed.setVisible(true);
                editarPacSCMed.setLocationRelativeTo(null);
                this.dispose();
            } else {
                mostrarMensaje("No selecciono ningun paciente", "Error", "Error al editar");
            }
        } else {
            mostrarMensaje("No hay pacientes internados", "Error", "Error al modificar");
        }
    }//GEN-LAST:event_btnEditarPacActionPerformed

    private void btnNuevoPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoPacienteActionPerformed
        NuevoPacienteSC nuevoPacSC = new NuevoPacienteSC();
        nuevoPacSC.setVisible(true);
        nuevoPacSC.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnNuevoPacienteActionPerformed

    private void btnEliminarPacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarPacActionPerformed
        if(tablaPacientesSC.getRowCount()>0){
            if(tablaPacientesSC.getSelectedRow()!=-1){
                int idPacSC = Integer.parseInt(String.valueOf(tablaPacientesSC.getValueAt(tablaPacientesSC.getSelectedRow(), 0)));
                control.borrarPacSC(idPacSC);
                mostrarMensaje("Paciente dado de alta correctamente", "Info", "Alta exitosa");
                cargarTablaPacSC();
            } else {
                mostrarMensaje("No ha seleccionado ningun paciente para dar de alta", "Error", "Error al eliminar");
            }
        } else {
            mostrarMensaje("No hay pacientes internados","Error","Error al eliminar");
        }
    }//GEN-LAST:event_btnEliminarPacActionPerformed

    private void btnRecargarTablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRecargarTablaActionPerformed
        cargarTablaPacSC();
    }//GEN-LAST:event_btnRecargarTablaActionPerformed
    
    public void mostrarMensaje(String mensaje, String tipo, String titulo) {
        JOptionPane optionPane = new JOptionPane(mensaje);
        if (tipo.equals("Info")) {
            optionPane.setMessageType(JOptionPane.INFORMATION_MESSAGE);
        } else if (tipo.equals("Error")) {
            optionPane.setMessageType(JOptionPane.ERROR_MESSAGE);
        }
        JDialog dialogo = optionPane.createDialog(titulo);
        dialogo.setAlwaysOnTop(true);
        dialogo.setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditarPac;
    private javax.swing.JButton btnEliminarPac;
    private javax.swing.JButton btnNuevoPaciente;
    private javax.swing.JButton btnRecargarTabla;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaPacientesSC;
    // End of variables declaration//GEN-END:variables

    private void cargarTablaPacSC() {
        DefaultTableModel modeloTabla = new DefaultTableModel() {
            @Override //para sobreescribir, para que se ponga todo en falso
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        String titulos[] = {"ID", "NOMBRE", "APELLIDO", "DNI", "OBSERVACIONES", "CAMA", "FECHA ING."};
        modeloTabla.setColumnIdentifiers(titulos);

        List<PacienteSC> listaPacientesSC = control.traerPacientesSC();

        if (listaPacientesSC != null) {
            for (PacienteSC pac : listaPacientesSC) {
                Object[] object = {pac.getId(), pac.getNombre(), pac.getApellido(), pac.getDni(), pac.getObservaciones(), pac.getCama(), pac.getFechaIngreso()};
                modeloTabla.addRow(object);
            }
        }

        tablaPacientesSC.setModel(modeloTabla);
    }

}
