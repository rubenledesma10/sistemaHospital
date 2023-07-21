package com.mycompany.sistemahospital.igu;

import com.mycompany.sistemahospital.logica.ControladoraLogica;
import com.mycompany.sistemahospital.logica.PacienteSC;

import java.util.List;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class PacientesSCEnfermeros extends javax.swing.JFrame {

    ControladoraLogica control = new ControladoraLogica();

    public PacientesSCEnfermeros() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        bttnEditar = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaPacientesSC = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setText("PACIENTES EN SALA COMÚN");

        bttnEditar.setText("EDITAR");
        bttnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnEditarActionPerformed(evt);
            }
        });

        btnVolver.setText("VOLVER");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bttnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(195, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(179, 179, 179))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(bttnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
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
        IntroScOTIEnfermeros scOti = new IntroScOTIEnfermeros();
        scOti.setVisible(true);
        scOti.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnVolverActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        cargarTablaPacSC();
    }//GEN-LAST:event_formWindowOpened

    private void bttnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnEditarActionPerformed
        if (tablaPacientesSC.getRowCount() > 0) {
            if (tablaPacientesSC.getSelectedRow() != -1) {
                int idPacSC = Integer.parseInt(String.valueOf(tablaPacientesSC.getValueAt(tablaPacientesSC.getSelectedRow(), 0)));
                EditarPacSC editarPacSC = new EditarPacSC(idPacSC);
                editarPacSC.setVisible(true);
                editarPacSC.setLocationRelativeTo(null);
                this.dispose();
            } else {
                mostrarMensaje("No selecciono ningun paciente", "Error", "Error al editar");
            }
        } else {
            mostrarMensaje("No hay pacientes internados", "Error", "Error al modificar");
        }
    }//GEN-LAST:event_bttnEditarActionPerformed
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
    private javax.swing.JButton btnVolver;
    private javax.swing.JButton bttnEditar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaPacientesSC;
    // End of variables declaration//GEN-END:variables

    private void cargarTablaPacSC() {
        //para que la tabla no sean editables, que si o si haga click en modificar si quiere modificar algo
        DefaultTableModel modeloTabla = new DefaultTableModel() {
            @Override //para sobreescribir, para que se ponga todo en falso
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        String titulos[] = {"ID", "NOMBRE", "APELLIDO", "DNI", "OBSERVACIONES", "CAMA", "FECHA ING."};
        modeloTabla.setColumnIdentifiers(titulos);

        //TRAER AUTOS DESDE LA BD 
        List<PacienteSC> listaPacientesSC = control.traerPacientesSC();

        //setear los datos en la tabla
        if (listaPacientesSC != null) {
            for (PacienteSC pac : listaPacientesSC) {
                Object[] object = {pac.getId(), pac.getNombre(), pac.getApellido(), pac.getDni(), pac.getObservaciones(), pac.getCama(), pac.getFechaIngreso()};
                //agrego el objeto que acabo de crear como fila al modelo de tabla
                modeloTabla.addRow(object);
            }
        }

        tablaPacientesSC.setModel(modeloTabla);
    }
}
