/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.VaccinationCenterWorkArea;

import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import UserInterface.VaccineManufacturerWorkArea.ManageOrdersJPanel;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author ayushgupta
 */
public class VaccinationCenterAdminJPanel extends javax.swing.JPanel {

    /**
     * Creates new form VaccinationCenterAdminJPanel
     */
    JPanel mainWorkArea;
    UserAccount account;
    Organization organization;
    Enterprise enterprise;
    public VaccinationCenterAdminJPanel(JPanel mainWorkArea, UserAccount account, Organization organization, Enterprise enterprise) {
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

        jLabel1 = new javax.swing.JLabel();
        btnViewInventory = new javax.swing.JButton();
        btnManageStaff = new javax.swing.JButton();
        btnPlaceOrder = new javax.swing.JButton();

        jLabel1.setText("Manage Vaccination Center");

        btnViewInventory.setText("View Inventory");
        btnViewInventory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewInventoryActionPerformed(evt);
            }
        });

        btnManageStaff.setText("Manage Staff");
        btnManageStaff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageStaffActionPerformed(evt);
            }
        });

        btnPlaceOrder.setText("Place Order");
        btnPlaceOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlaceOrderActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(397, 397, 397)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btnPlaceOrder, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnManageStaff, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnViewInventory, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(408, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(84, 84, 84)
                .addComponent(btnViewInventory)
                .addGap(37, 37, 37)
                .addComponent(btnManageStaff)
                .addGap(27, 27, 27)
                .addComponent(btnPlaceOrder)
                .addContainerGap(476, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnViewInventoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewInventoryActionPerformed
       ViewVaccineInventoryJPanel viewVaccineInventoryJPanel = new ViewVaccineInventoryJPanel();
       mainWorkArea.add("viewVaccineInventoryJPanel", viewVaccineInventoryJPanel);
       CardLayout layout = (CardLayout) mainWorkArea.getLayout();
       layout.next( mainWorkArea);
    }//GEN-LAST:event_btnViewInventoryActionPerformed

    private void btnManageStaffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageStaffActionPerformed
       ManageVaccinationCenterStaffJPanel manageVaccinationCenterStaffJPanel = new ManageVaccinationCenterStaffJPanel( );
       mainWorkArea.add("manageVaccinationCenterStaffJPanel", manageVaccinationCenterStaffJPanel);
       CardLayout layout = (CardLayout) mainWorkArea.getLayout();
       layout.next( mainWorkArea);
    }//GEN-LAST:event_btnManageStaffActionPerformed

    private void btnPlaceOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlaceOrderActionPerformed
       PlaceVaccineOrderJPanel placeVaccineOrderJPanel = new PlaceVaccineOrderJPanel();
       mainWorkArea.add("placeVaccineOrderJPanel", placeVaccineOrderJPanel);
       CardLayout layout = (CardLayout) mainWorkArea.getLayout();
       layout.next( mainWorkArea);
    }//GEN-LAST:event_btnPlaceOrderActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnManageStaff;
    private javax.swing.JButton btnPlaceOrder;
    private javax.swing.JButton btnViewInventory;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
