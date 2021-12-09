/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.TestingCenterWorkArea;

import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author pradnyalgandhi
 */
public class LabAdminJPanel extends javax.swing.JPanel {

    /**
     * Creates new form LabAdminJPanel
     */
    JPanel mainWorkArea;
    UserAccount account;
    Organization organization;
    Enterprise enterprise;
    public LabAdminJPanel(JPanel mainWorkArea, UserAccount account, Organization organization, Enterprise enterprise) {
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

        btnManageReport = new javax.swing.JButton();
        lblManufacturereAdmin = new javax.swing.JLabel();
        btnNewReport = new javax.swing.JButton();

        btnManageReport.setText("Manage Test Reports");
        btnManageReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageReportActionPerformed(evt);
            }
        });

        lblManufacturereAdmin.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        lblManufacturereAdmin.setForeground(new java.awt.Color(204, 204, 204));
        lblManufacturereAdmin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblManufacturereAdmin.setText("Welcome, Testing Lab Admin");

        btnNewReport.setText("New Report");
        btnNewReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewReportActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblManufacturereAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, 988, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(379, 379, 379)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnManageReport, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnNewReport, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(lblManufacturereAdmin)
                .addGap(57, 57, 57)
                .addComponent(btnNewReport)
                .addGap(18, 18, 18)
                .addComponent(btnManageReport)
                .addContainerGap(601, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnManageReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageReportActionPerformed
        // TODO add your handling code here:
        ManageTestReportsJPanel testReportPanel = new ManageTestReportsJPanel();
        mainWorkArea.add('testReportPanel', testReportPanel);
        CardLayout layout = (CardLayout) mainWorkArea.getLayout();
        layout.next(mainWorkArea);
    }//GEN-LAST:event_btnManageReportActionPerformed

    private void btnNewReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewReportActionPerformed
        // TODO add your handling code here:
        NewReportJPanel reportPanel = new NewReportJPanel();
        mainWorkArea.add('reportPanel', reportPanel);
        CardLayout layout = (CardLayout) mainWorkArea.getLayout();
        layout.next(mainWorkArea);
    }//GEN-LAST:event_btnNewReportActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnManageReport;
    private javax.swing.JButton btnNewReport;
    private javax.swing.JLabel lblManufacturereAdmin;
    // End of variables declaration//GEN-END:variables
}
