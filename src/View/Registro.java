/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Model.UsuarioDAO;
import javax.swing.JOptionPane;

/**
 *
 * @author valer
 */
public class Registro extends javax.swing.JFrame {

    /**
     * Creates new form Registro
     */
    public Registro() {
        initComponents();
        this.setLocationRelativeTo(null);
        btncrearcuenta.setEnabled(false);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBox1 = new javax.swing.JCheckBox();
        jPanel1 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtRname = new javax.swing.JTextField();
        txtRemail = new javax.swing.JTextField();
        txtRcellphone = new javax.swing.JTextField();
        txtRpass = new javax.swing.JTextField();
        txtRconfirmpass = new javax.swing.JTextField();
        btncrearcuenta = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txtRidentificacion = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jCheckBox2 = new javax.swing.JCheckBox();
        jLabel9 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();

        jCheckBox1.setText("jCheckBox1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("REGISTRO\n");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setMinimumSize(new java.awt.Dimension(1510, 630));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 500));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(61, 138, 157));
        jPanel5.setPreferredSize(new java.awt.Dimension(400, 500));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Full name*");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, -1, -1));

        jLabel3.setText("Email *");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, -1, -1));

        jLabel4.setText("Cell phone number*");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, -1, -1));

        jLabel5.setText("Password*");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, -1, -1));

        jLabel6.setText("Confirm pasword*");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Create new account ");
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, -1, -1));

        txtRname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRnameActionPerformed(evt);
            }
        });
        jPanel4.add(txtRname, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 220, -1));
        jPanel4.add(txtRemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 220, -1));

        txtRcellphone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRcellphoneActionPerformed(evt);
            }
        });
        jPanel4.add(txtRcellphone, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 220, -1));

        txtRpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRpassActionPerformed(evt);
            }
        });
        jPanel4.add(txtRpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, 220, -1));
        jPanel4.add(txtRconfirmpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, 220, -1));

        btncrearcuenta.setBackground(new java.awt.Color(38, 75, 100));
        btncrearcuenta.setForeground(new java.awt.Color(255, 255, 255));
        btncrearcuenta.setText("Create account");
        btncrearcuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncrearcuentaActionPerformed(evt);
            }
        });
        jPanel4.add(btncrearcuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, 130, 30));

        jButton3.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jButton3.setText("Terminos");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 380, 80, 20));

        jLabel8.setText("identification*");
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, -1, -1));

        txtRidentificacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRidentificacionActionPerformed(evt);
            }
        });
        jPanel4.add(txtRidentificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 220, -1));

        jButton2.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        jButton2.setText("Login");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(192, 340, 80, 30));

        jCheckBox2.setText("Acepto todos los ");
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });
        jPanel4.add(jCheckBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 380, -1, -1));

        jPanel5.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 60, 350, 410));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo h final.png"))); // NOI18N
        jLabel9.setText("jLabel3");
        jPanel5.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 790, 440));

        jPanel7.setBackground(new java.awt.Color(38, 75, 100));
        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(192, 201, 211)));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("NOESAVIANCA");
        jPanel7.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 10, 100, 20));

        jPanel5.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 810, 40));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -10, 810, 520));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtRpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRpassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRpassActionPerformed

    private void txtRcellphoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRcellphoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRcellphoneActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
                new Login().setVisible(true);
                this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        new terminosycondiciones().setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void btncrearcuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncrearcuentaActionPerformed
        String nombre = txtRname.getText();
        String contraseña = new String(txtRpass.getText());
        String correo = txtRemail.getText();
        String telefono = txtRcellphone.getText();
        String identificacion = txtRidentificacion.getText();
        String rol = "usuario"; // O "admin", dependiendo de lo que quieras asignar al usuario

    UsuarioDAO userDao = new UsuarioDAO();
    boolean exito = userDao.registrarUsuario(nombre, contraseña, correo, telefono, identificacion, rol);
    
    
    if (exito) {
        JOptionPane.showMessageDialog(this, "Usuario registrado con éxito.", "Registro", JOptionPane.INFORMATION_MESSAGE);
        new Login().setVisible(true);
        this.setVisible(false);
        this.dispose();
    } else if (nombre.isEmpty() || contraseña.isEmpty() || correo.isEmpty() || telefono.isEmpty()|| identificacion == null) {
        JOptionPane.showMessageDialog(this, "error al registrar usurio, porfavor asegurarse de seleccionar todos los campos requeridos.", "Advertencia", JOptionPane.WARNING_MESSAGE);
         
    }else {
        JOptionPane.showMessageDialog(this, "Error al registrar el usuario.", "Registro", JOptionPane.ERROR_MESSAGE);
    }
        
        
    }//GEN-LAST:event_btncrearcuentaActionPerformed

    private void txtRnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRnameActionPerformed

    private void txtRidentificacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRidentificacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRidentificacionActionPerformed

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
         if (jCheckBox2.isSelected()) {
                btncrearcuenta.setEnabled(true);  // Habilitar el botón si está seleccionado
            } else {
                btncrearcuenta.setEnabled(false);  // Deshabilitar el botón si no está seleccionado
            }
    }//GEN-LAST:event_jCheckBox2ActionPerformed

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
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncrearcuenta;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JTextField txtRcellphone;
    private javax.swing.JTextField txtRconfirmpass;
    private javax.swing.JTextField txtRemail;
    private javax.swing.JTextField txtRidentificacion;
    private javax.swing.JTextField txtRname;
    private javax.swing.JTextField txtRpass;
    // End of variables declaration//GEN-END:variables
}
