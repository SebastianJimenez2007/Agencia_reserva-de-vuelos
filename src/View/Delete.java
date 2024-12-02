/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package View;

import Model.AdminDAO;
import java.awt.Color;
import javax.swing.JOptionPane;
import Model.ConexionDB;
import java.sql.Connection;
import java.sql.SQLException;
/**
 *
 * @author Sebastian JB
 */
public class Delete extends javax.swing.JPanel {

    /**
     * Creates new form Delete
     */
    public Delete() {
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

        txtIdVuelo = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(txtIdVuelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, 120, -1));

        jButton4.setText("Eliminate");
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, -1, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel13.setText("Add Flights");
        add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 190, 50));

        jLabel1.setText("ID flight");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        String idVueloStr = txtIdVuelo.getText(); // Supongamos que el ID está en un JTextField llamado txtIdVuelo

        if (idVueloStr.trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, ingrese el ID del vuelo a eliminar.", "Advertencia", JOptionPane.WARNING_MESSAGE);
            return;
        }

        try {
            int idVuelo = Integer.parseInt(idVueloStr.trim()); // Convertir a entero
            try (Connection connection = ConexionDB.conectar()) {
                AdminDAO adminDAO = new AdminDAO(connection);

                if (adminDAO.eliminarVuelo(idVuelo)) {
                    JOptionPane.showMessageDialog(this, "Vuelo eliminado exitosamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(this, "No se encontró un vuelo con ese ID.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(this, "Error al conectar con la base de datos: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "El ID debe ser un número válido.", "Error", JOptionPane.ERROR_MESSAGE);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JTextField txtIdVuelo;
    // End of variables declaration//GEN-END:variables
}
