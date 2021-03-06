/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacientes.ui;

import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import paciente.util.HibernateUtil;
import pacientes.entity.Paciente;

/**
 *
 * @author mrjab
 */
public class Carga extends javax.swing.JFrame {

    /**
     * Creates new form Carga
     */
    public Carga() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        VentanaGuardar = new javax.swing.JDialog();
        jLabel8 = new javax.swing.JLabel();
        okButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Vtipodoc = new javax.swing.JComboBox<>();
        Vnombre = new javax.swing.JTextField();
        Vapellido = new javax.swing.JTextField();
        Vtelefono = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        Vnro = new javax.swing.JTextField();
        Vemail = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Bguardar = new javax.swing.JButton();
        listapaciente = new javax.swing.JButton();

        VentanaGuardar.setMinimumSize(new java.awt.Dimension(335, 150));
        VentanaGuardar.setModal(true);
        VentanaGuardar.setPreferredSize(new java.awt.Dimension(326, 105));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("El paciente fue guardado exitosamente");
        jLabel8.setMinimumSize(new java.awt.Dimension(306, 95));

        okButton.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        okButton.setText("OK");
        okButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout VentanaGuardarLayout = new javax.swing.GroupLayout(VentanaGuardar.getContentPane());
        VentanaGuardar.getContentPane().setLayout(VentanaGuardarLayout);
        VentanaGuardarLayout.setHorizontalGroup(
            VentanaGuardarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(VentanaGuardarLayout.createSequentialGroup()
                .addGroup(VentanaGuardarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(VentanaGuardarLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(VentanaGuardarLayout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addComponent(okButton)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        VentanaGuardarLayout.setVerticalGroup(
            VentanaGuardarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(VentanaGuardarLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(okButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Nombre");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Apellido");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Telefono");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Tipo Documento");

        Vtipodoc.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Vtipodoc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dni", "Pasaporte", "LC", "Otros" }));

        Vnombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Vnombre.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                VnombreComponentAdded(evt);
            }
        });
        Vnombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VnombreActionPerformed(evt);
            }
        });

        Vapellido.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Vapellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VapellidoActionPerformed(evt);
            }
        });

        Vtelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VtelefonoActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Nro");

        Vnro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VnroActionPerformed(evt);
            }
        });

        Vemail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VemailActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("E-mail");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Por favor ingrese los datos:");

        Bguardar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Bguardar.setText("Guardar");
        Bguardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BguardarMouseClicked(evt);
            }
        });
        Bguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BguardarActionPerformed(evt);
            }
        });

        listapaciente.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        listapaciente.setText("Volver a lista de pacientes");
        listapaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listapacienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(Vtipodoc, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(Vnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel2)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Vapellido, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(Vtelefono))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(8, 8, 8)
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Vnro, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(Vemail, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)))))
                        .addGap(10, 10, 10))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(listapaciente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Bguardar)
                        .addGap(25, 25, 25))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(Vnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(Vapellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(Vtelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Vtipodoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(Vnro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Vemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Bguardar)
                    .addComponent(listapaciente))
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void VapellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VapellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_VapellidoActionPerformed

    private void VnroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VnroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_VnroActionPerformed

    private void VnombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VnombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_VnombreActionPerformed

    private void VtelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VtelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_VtelefonoActionPerformed

    private void VemailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VemailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_VemailActionPerformed

    private void VnombreComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_VnombreComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_VnombreComponentAdded

    private void BguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BguardarActionPerformed
        runQueryGuardar();
    }//GEN-LAST:event_BguardarActionPerformed

    private void listapacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listapacienteActionPerformed
        Lista l=new Lista();
        l.setVisible(true);
        dispose();
    }//GEN-LAST:event_listapacienteActionPerformed

    private void okButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okButtonActionPerformed
        VentanaGuardar.dispose();
    }//GEN-LAST:event_okButtonActionPerformed

    private void BguardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BguardarMouseClicked
        this.VentanaGuardar.setVisible(true);
    }//GEN-LAST:event_BguardarMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Carga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Carga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Carga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Carga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Carga().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bguardar;
    private javax.swing.JTextField Vapellido;
    private javax.swing.JTextField Vemail;
    private javax.swing.JDialog VentanaGuardar;
    private javax.swing.JTextField Vnombre;
    private javax.swing.JTextField Vnro;
    private javax.swing.JTextField Vtelefono;
    private javax.swing.JComboBox<String> Vtipodoc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JButton listapaciente;
    private javax.swing.JButton okButton;
    // End of variables declaration//GEN-END:variables

private void runQueryGuardar() {
    executeHQLQuery();
}

private void executeHQLQuery() {
    try {
	Session session = HibernateUtil.getSessionFactory().openSession();
	session.beginTransaction();
       
	//Add new Employee object
	Paciente p = new Paciente();
	p.setIdpaciente(null);
	p.setNombre(Vnombre.getText());
	p.setApellido(Vapellido.getText());
        p.setTipodoc(Vtipodoc.getSelectedItem().toString());
	p.setNrodoc(Integer.valueOf(Vnro.getText()));
        p.setTelefono(Integer.valueOf(Vtelefono.getText()));
        p.setEmail(Vemail.getText());
	session.save(p);

	session.getTransaction().commit();
    } catch (HibernateException he) {
        he.printStackTrace();
    }
}

}

