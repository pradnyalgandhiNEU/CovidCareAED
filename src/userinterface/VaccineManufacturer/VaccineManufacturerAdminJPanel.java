/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.VaccineManufacturer;

import Business.City.City;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author ayushgupta
 */
public class VaccineManufacturerAdminJPanel extends javax.swing.JPanel {

    /**
     * Creates new form VaccineManufacturerAdminJPanel
     */
    JPanel userProcessContainer;
    EcoSystem system;
    UserAccount userAccount;
    Organization organization;
    Enterprise enterprise;
    City city;
    //Enterprise enterprise;
    public VaccineManufacturerAdminJPanel(JPanel userProcessContainer, City city, UserAccount userAccount, Organization organization, 
            Enterprise enterprise, EcoSystem system) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.system=system;
        this.userAccount=userAccount;
        this.city=city;
        this.organization=organization;
        this.enterprise=enterprise;
        //this.enterprise=enterprise;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnManageInventory = new javax.swing.JButton();
        btnManageDeliveryManger = new javax.swing.JButton();
        lblManufacturereAdmin = new javax.swing.JLabel();
        btnManageOrder = new javax.swing.JButton();

        btnManageInventory.setText("Manage Inventory");
        btnManageInventory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageInventoryActionPerformed(evt);
            }
        });

        btnManageDeliveryManger.setText("Manage Delivery Manager");
        btnManageDeliveryManger.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageDeliveryMangerActionPerformed(evt);
            }
        });

        lblManufacturereAdmin.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        lblManufacturereAdmin.setForeground(new java.awt.Color(204, 204, 204));
        lblManufacturereAdmin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblManufacturereAdmin.setText("Welcome, Vaccine Manufacturer");

        btnManageOrder.setText("Manage Orders");
        btnManageOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageOrderActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblManufacturereAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, 988, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(387, 387, 387)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnManageDeliveryManger, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnManageOrder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnManageInventory, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(lblManufacturereAdmin)
                .addGap(62, 62, 62)
                .addComponent(btnManageInventory)
                .addGap(18, 18, 18)
                .addComponent(btnManageDeliveryManger)
                .addGap(18, 18, 18)
                .addComponent(btnManageOrder)
                .addContainerGap(541, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnManageInventoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageInventoryActionPerformed
       ManageInventoryJPanel manageInventoryJPanel = new ManageInventoryJPanel(userProcessContainer, city, userAccount, organization, enterprise, system);
       userProcessContainer.add("manageTestCenterJPanel", manageInventoryJPanel);
       CardLayout layout = (CardLayout) userProcessContainer.getLayout();
       layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManageInventoryActionPerformed

    private void btnManageDeliveryMangerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageDeliveryMangerActionPerformed
       ManageDeliveryManagerJPanel manageDeliveryJPanel = new ManageDeliveryManagerJPanel(userProcessContainer, city, userAccount, organization, enterprise, system);
       userProcessContainer.add("manageDeliveryJPanel", manageDeliveryJPanel);
       CardLayout layout = (CardLayout) userProcessContainer.getLayout();
       layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManageDeliveryMangerActionPerformed

    private void btnManageOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageOrderActionPerformed
       ManageOrdersJPanel manageOrderJPanel = new ManageOrdersJPanel(userProcessContainer, city, userAccount, organization, enterprise, system);
       userProcessContainer.add("manageOrderJPanel", manageOrderJPanel);
       CardLayout layout = (CardLayout) userProcessContainer.getLayout();
       layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManageOrderActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnManageDeliveryManger;
    private javax.swing.JButton btnManageInventory;
    private javax.swing.JButton btnManageOrder;
    private javax.swing.JLabel lblManufacturereAdmin;
    // End of variables declaration//GEN-END:variables
}
