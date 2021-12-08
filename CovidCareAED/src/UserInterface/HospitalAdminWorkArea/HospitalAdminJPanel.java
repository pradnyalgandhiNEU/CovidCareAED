/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.HospitalAdminWorkArea;

import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author pradnyalgandhi
 */
public class HospitalAdminJPanel extends javax.swing.JPanel {

    /**
     * Creates new form HospitalAdminJPanel
     */
    JPanel mainWorkArea;
    UserAccount account;
    Organization organization;
    Enterprise enterprise;
    public HospitalAdminJPanel(JPanel mainWorkArea, UserAccount account, Organization organization, Enterprise enterprise){
        initComponents();
        this.mainWorkArea = mainWorkArea;
        this.account=account;
        this.organization=organization;
        this.enterprise=enterprise;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnManagePatient = new javax.swing.JButton();
        btnManageStaff = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnManageDoctor = new javax.swing.JButton();
        btnManageCapacity = new javax.swing.JButton();

        btnManagePatient.setText("Manage Patient");
        btnManagePatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManagePatientActionPerformed(evt);
            }
        });

        btnManageStaff.setText("Manage Staff");
        btnManageStaff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageStaffActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Welcome, Hospital Admin");

        btnManageDoctor.setText("Manage Doctor");
        btnManageDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageDoctorActionPerformed(evt);
            }
        });

        btnManageCapacity.setText("Manage Capacity");
        btnManageCapacity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageCapacityActionPerformed(evt);
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnManageStaff, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnManageCapacity, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnManagePatient, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnManageDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel1)
                .addGap(57, 57, 57)
                .addComponent(btnManageDoctor)
                .addGap(18, 18, 18)
                .addComponent(btnManagePatient)
                .addGap(18, 18, 18)
                .addComponent(btnManageStaff)
                .addGap(18, 18, 18)
                .addComponent(btnManageCapacity)
                .addContainerGap(519, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnManagePatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManagePatientActionPerformed
        // TODO add your handling code here:
        ManagePatientJPanel patientPanel = new ManagePatientJPanel();
        mainWorkMain.add('patientPanel', patientPanel);
        CardLayout layout = (CardLayout) mainWorkArea.getLayout();
        layout.next(mainWorkArea);
    }//GEN-LAST:event_btnManagePatientActionPerformed

    private void btnManageStaffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageStaffActionPerformed
        // TODO add your handling code here:
        ManageStaffJPanel staffPanel = new ManageStaffJPanel();
        mainWorkMain.add('staffPanel', staffPanel);
        CardLayout layout = (CardLayout) mainWorkArea.getLayout();
        layout.next(mainWorkArea);
    }//GEN-LAST:event_btnManageStaffActionPerformed

    private void btnManageDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageDoctorActionPerformed
        // TODO add your handling code here:
        ManageDoctorJPanel doctorPanel = new ManageDoctorJPanel();
        mainWorkMain.add('doctorPanel', doctorPanel);
        CardLayout layout = (CardLayout) mainWorkArea.getLayout();
        layout.next(mainWorkArea);
    }//GEN-LAST:event_btnManageDoctorActionPerformed

    private void btnManageCapacityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageCapacityActionPerformed
        // TODO add your handling code here:
        ManageCapacityJPanel capacityPanel = new ManageCapacityJPanel();
        mainWorkMain.add('capacityPanel', capactiyPanel);
        CardLayout layout = (CardLayout) mainWorkArea.getLayout();
        layout.next(mainWorkArea);
    }//GEN-LAST:event_btnManageCapacityActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnManageCapacity;
    private javax.swing.JButton btnManageDoctor;
    private javax.swing.JButton btnManagePatient;
    private javax.swing.JButton btnManageStaff;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
