package com.mycompany.sistemahospital.igu;

import com.mycompany.sistemahospital.logica.ControladoraLogica;
import com.mycompany.sistemahospital.logica.PacienteSC;
import com.mycompany.sistemahospital.logica.PacienteTI;
import java.util.List;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class PacientesTIMedicos extends javax.swing.JFrame {
    
    ControladoraLogica control = new ControladoraLogica();
    
    public PacientesTIMedicos() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnNuevoPac = new javax.swing.JButton();
        btnEliminarPac = new javax.swing.JButton();
        btnEditarPac = new javax.swing.JButton();
        btnRecargarTabla = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaPacientesTI = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setText("PACIENTES EN TERAPIA INTENSIVA");

        btnNuevoPac.setText("INGRESAR PACIENTE");
        btnNuevoPac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoPacActionPerformed(evt);
            }
        });

        btnEliminarPac.setText("DAR DE ALTA");
        btnEliminarPac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarPacActionPerformed(evt);
            }
        });

        btnEditarPac.setText("EDITAR PACIENTE");
        btnEditarPac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarPacActionPerformed(evt);
            }
        });

        btnRecargarTabla.setText("RECARGAR TABLA");
        btnRecargarTabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRecargarTablaActionPerformed(evt);
            }
        });

        btnVolver.setText("VOLVER");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        tablaPacientesTI.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablaPacientesTI);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 196, Short.MAX_VALUE)
                        .addComponent(jLabel1))
                    .addComponent(jScrollPane1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEliminarPac, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNuevoPac)
                    .addComponent(btnEditarPac, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRecargarTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnNuevoPac, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminarPac, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnEditarPac, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnRecargarTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
        cargarTablaPacTI();
    }//GEN-LAST:event_formWindowOpened

    private void btnNuevoPacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoPacActionPerformed
        NuevoPacienteTI pacTI = new NuevoPacienteTI();
        pacTI.setVisible(true);
        pacTI.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnNuevoPacActionPerformed

    private void btnEliminarPacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarPacActionPerformed
        if(tablaPacientesTI.getRowCount()>0){
            if(tablaPacientesTI.getSelectedRow()!=-1){
                int idPacTI = Integer.parseInt(String.valueOf(tablaPacientesTI.getValueAt(tablaPacientesTI.getSelectedRow(), 0)));
                control.borrarPacTI(idPacTI);
                mostrarMensaje("Paciente dado de alta correctamente", "Info", "Alta exitosa");
                cargarTablaPacTI();
            } else {
                mostrarMensaje("No ha seleccionado ningun paciente para dar de alta", "Error", "Error al eliminar");
            }
        } else {
            mostrarMensaje("No hay pacientes internados","Error","Error al eliminar");
        }
    }//GEN-LAST:event_btnEliminarPacActionPerformed

    private void btnRecargarTablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRecargarTablaActionPerformed
        cargarTablaPacTI();
    }//GEN-LAST:event_btnRecargarTablaActionPerformed

    private void btnEditarPacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarPacActionPerformed
        if(tablaPacientesTI.getRowCount()>0){
            if(tablaPacientesTI.getSelectedRow()!=-1){
                int idPacTi = Integer.parseInt(String.valueOf(tablaPacientesTI.getValueAt(tablaPacientesTI.getSelectedRow(), 0)));
                EditarPacTIMed editarPacTIMed = new EditarPacTIMed(idPacTi);
                editarPacTIMed.setVisible(true);
                editarPacTIMed.setLocationRelativeTo(null);
                this.dispose();
            } else {
                mostrarMensaje("No selecciono ningun paciente", "Error", "Error al editar");
            }
        } else {
            mostrarMensaje("No hay pacientes internados", "Error", "Error al modificar");
        }
    }//GEN-LAST:event_btnEditarPacActionPerformed
    
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
    private javax.swing.JButton btnNuevoPac;
    private javax.swing.JButton btnRecargarTabla;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaPacientesTI;
    // End of variables declaration//GEN-END:variables

    private void cargarTablaPacTI() {
        DefaultTableModel modeloTabla = new DefaultTableModel() {
            @Override //para sobreescribir, para que se ponga todo en falso
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        String titulos[] = {"ID", "NOMBRE", "APELLIDO", "DNI", "OBSERVACIONES", "CAMA", "FECHA ING."};
        modeloTabla.setColumnIdentifiers(titulos);

        List<PacienteTI> listaPacientesTI = control.traerPacientesTI();

        if (listaPacientesTI != null) {
            for (PacienteTI pac : listaPacientesTI) {
                Object[] object = {pac.getId(), pac.getNombre(), pac.getApellido(), pac.getDni(), pac.getObservaciones(), pac.getCama(), pac.getFechaIngreso()};
                modeloTabla.addRow(object);
            }
        }

        tablaPacientesTI.setModel(modeloTabla);
    }
}
