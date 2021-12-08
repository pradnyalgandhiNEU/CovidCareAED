/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.SystemAdminWorkArea;

import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author pradnyalgandhi
 */
public class SystemAdminWorkJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SystemAdminWorkJPanel
     */
    JPanel mainWorkArea;
    public SystemAdminWorkJPanel() {
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

        btnManageHospital = new javax.swing.JButton();
        btnManageTestCenter = new javax.swing.JButton();
        btnManagePerson = new javax.swing.JButton();
        btnManageVaccineManufacturer = new javax.swing.JButton();
        btnManageVaccinationCenter = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnManageAdmin = new javax.swing.JButton();

        btnManageHospital.setText("Manage Hospital");
        btnManageHospital.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageHospitalActionPerformed(evt);
            }
        });

        btnManageTestCenter.setText("Manage Test Center");
        btnManageTestCenter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageTestCenterActionPerformed(evt);
            }
        });

        btnManagePerson.setText("Manage Person");
        btnManagePerson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManagePersonActionPerformed(evt);
            }
        });

        btnManageVaccineManufacturer.setText("Manage Vaccine Manufacturer");
        btnManageVaccineManufacturer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageVaccineManufacturerActionPerformed(evt);
            }
        });

        btnManageVaccinationCenter.setText("Manage Vaccination Center");
        btnManageVaccinationCenter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageVaccinationCenterActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Welcome, System Admin ");

        btnManageAdmin.setText("Manage Admins");
        btnManageAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageAdminActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 988, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(379, 379, 379)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnManageVaccinationCenter, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnManageVaccineManufacturer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnManagePerson, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnManageHospital, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnManageTestCenter, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnManageAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel1)
                .addGap(90, 90, 90)
                .addComponent(btnManageAdmin)
                .addGap(18, 18, 18)
                .addComponent(btnManagePerson)
                .addGap(18, 18, 18)
                .addComponent(btnManageHospital)
                .addGap(18, 18, 18)
                .addComponent(btnManageTestCenter)
                .addGap(18, 18, 18)
                .addComponent(btnManageVaccineManufacturer)
                .addGap(18, 18, 18)
                .addComponent(btnManageVaccinationCenter)
                .addContainerGap(404, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnManageHospitalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageHospitalActionPerformed
        // TODO add your handling code here:
        ManageHospitalJPanel hospitalPanel = new ManageHospitalJPanel();
        mainWorkArea.add('hospitalPanel', hospitalPanel);
        CardLayout layout = (CardLayout) mainWorkArea.getLayout();
        layout.next(mainWorkArea);
    }//GEN-LAST:event_btnManageHospitalActionPerformed

    private void btnManageTestCenterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageTestCenterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnManageTestCenterActionPerformed

    private void btnManagePersonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManagePersonActionPerformed
        // TODO add your handling code here:
        ManagePersonJPanel personPanel = new ManagePersonJPanel();
        mainWorkArea.add('personPanel', personPanel);
        CardLayout layout = (CardLayout) mainWorkArea.getLayout();
        layout.next(mainWorkArea);
    }//GEN-LAST:event_btnManagePersonActionPerformed

    private void btnManageVaccineManufacturerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageVaccineManufacturerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnManageVaccineManufacturerActionPerformed

    private void btnManageVaccinationCenterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageVaccinationCenterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnManageVaccinationCenterActionPerformed

    private void btnManageAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageAdminActionPerformed
        // TODO add your handling code here:
        ManageAdminJPanel adminPanel = new ManageAdminJPanel();
        mainWorkArea.add('adminPanel', adminPanel);
        CardLayout layout = (CardLayout) mainWorkArea.getLayout();
        layout.next(mainWorkArea);
        
        
    }//GEN-LAST:event_btnManageAdminActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnManageAdmin;
    private javax.swing.JButton btnManageHospital;
    private javax.swing.JButton btnManagePerson;
    private javax.swing.JButton btnManageTestCenter;
    private javax.swing.JButton btnManageVaccinationCenter;
    private javax.swing.JButton btnManageVaccineManufacturer;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
