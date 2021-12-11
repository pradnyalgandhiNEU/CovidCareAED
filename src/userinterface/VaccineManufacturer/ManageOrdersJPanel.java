/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface.VaccineManufacturer;

import Business.City.City;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.VaccineManufacturer;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.Vaccine.Vaccine;
import Business.WorkQueue.Order;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author pradnyalgandhi
 */
public class ManageOrdersJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageOrdersJPanel
     */
    JPanel userProcessContainer;
    EcoSystem system;
    UserAccount userAccount;
    Organization organization;
    Enterprise enterprise;
    City city;
    public ManageOrdersJPanel(JPanel userProcessContainer, City city, UserAccount userAccount, Organization organization, 
            Enterprise enterprise, EcoSystem system) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.system=system;
        this.userAccount=userAccount;
        this.city=city;
        this.organization=organization;
        this.enterprise=enterprise;
        populateTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblOrder = new javax.swing.JTable();
        lblManageOrders = new javax.swing.JLabel();
        btnReadyToDeliver = new javax.swing.JButton();
        AssignBtn1 = new javax.swing.JButton();
        btnDenyOrder = new javax.swing.JButton();
        lblAvailableStock = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        tblOrder.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Order ID", "Date", "Vaccine", "Batch No", "Quantity", "Vaccination Center", "Status"
            }
        ));
        jScrollPane1.setViewportView(tblOrder);

        lblManageOrders.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        lblManageOrders.setForeground(new java.awt.Color(204, 204, 204));
        lblManageOrders.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblManageOrders.setText("Manage Vaccine Orders");

        btnReadyToDeliver.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnReadyToDeliver.setText("Ready to Deliver");
        btnReadyToDeliver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReadyToDeliverActionPerformed(evt);
            }
        });

        AssignBtn1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        AssignBtn1.setText("Assign to Delivery Man ");
        AssignBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AssignBtn1ActionPerformed(evt);
            }
        });

        btnDenyOrder.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        btnDenyOrder.setText("Deny Order");
        btnDenyOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDenyOrderActionPerformed(evt);
            }
        });

        jButton1.setText("Available Stock");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 988, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(AssignBtn1)
                        .addGap(253, 253, 253)
                        .addComponent(btnReadyToDeliver)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnDenyOrder)
                        .addGap(39, 39, 39))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblManageOrders, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(39, 39, 39)
                .addComponent(lblAvailableStock, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(104, 104, 104))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(lblManageOrders)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1)
                    .addComponent(lblAvailableStock, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AssignBtn1)
                    .addComponent(btnReadyToDeliver)
                    .addComponent(btnDenyOrder))
                .addContainerGap(248, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnReadyToDeliverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReadyToDeliverActionPerformed
        //System.out.println(enterprise.getWorkQueue().getWorkRequestList());
        int selectedRow = tblOrder.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row from the table to view details", "Warning", JOptionPane.WARNING_MESSAGE);
        }
        Order placeorder  = (Order)tblOrder.getValueAt(selectedRow, 0);
            if(placeorder.getStatus().equals("Ready to Deliver")){
                JOptionPane.showMessageDialog(null,"Already Ready");
            } else if (placeorder.getStatus().equals("New Order") || (placeorder.getStatus().equals("Order Denied"))){
            placeorder.setStatus("Ready to Deliver");
            }
            else{
                JOptionPane.showMessageDialog(this,"Already ready to deliver");
            }
            for (WorkRequest wr : enterprise.getWorkQueue().getWorkRequestList()) {
                    Order order = (Order)wr;
                    if(order.getId()==placeorder.getId()){
                        order.setStatus("Ready to deliver");
                    }
            }    
    }//GEN-LAST:event_btnReadyToDeliverActionPerformed

    private void AssignBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AssignBtn1ActionPerformed
       AssignDeliveryManagerJPanel assignDeliveryManagerJPanel = new AssignDeliveryManagerJPanel(userProcessContainer, city, userAccount, organization, enterprise, system);
       userProcessContainer.add("assignDeliveryManagerJPanel", assignDeliveryManagerJPanel);
       CardLayout layout = (CardLayout) userProcessContainer.getLayout();
       layout.next(userProcessContainer);
    }//GEN-LAST:event_AssignBtn1ActionPerformed

    private void btnDenyOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDenyOrderActionPerformed

    }//GEN-LAST:event_btnDenyOrderActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        VaccineManufacturer e =(VaccineManufacturer)enterprise;
        int count = 0;
        for(Vaccine vaccine: e.getVaccineDirectory().getVaccDir()){
          count = count+vaccine.getQty();
        }
        lblAvailableStock.setText(String.valueOf(count));
        
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AssignBtn1;
    private javax.swing.JButton btnDenyOrder;
    private javax.swing.JButton btnReadyToDeliver;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAvailableStock;
    private javax.swing.JLabel lblManageOrders;
    private javax.swing.JTable tblOrder;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        DefaultTableModel dtm = (DefaultTableModel) tblOrder.getModel();
        dtm.setRowCount(0);

            
                for (WorkRequest wr : enterprise.getWorkQueue().getWorkRequestList()) {
                    Order order = (Order)wr;
                    
                    Object[] row = new Object[7];
                    row[0] = order.getMessage();
                    row[1] = order.getReceiver();
                    row[2] = order.getSender();
                    row[3] = order.getStatus();
                    row[4] = order.getQuantity();
                    row[5] = order.getVaccineName();
                    row[6] = order.getId();

                    dtm.addRow(row);
                
                }//To change body of generated methods, choose Tools | Templates.
  
    }
}
