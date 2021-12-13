/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.VaccinationCenter;

import Business.City.City;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.Order;
import Business.WorkQueue.WorkQueue;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author ayushgupta
 */
public class PlaceVaccineOrderJPanel extends javax.swing.JPanel {

    /**
     * Creates new form PlaceVaccineOrder
     */
    JPanel userProcessContainer;
    EcoSystem system;
    UserAccount userAccount;
    Organization organization;
    Enterprise enterprise;
    City city;
    public PlaceVaccineOrderJPanel(JPanel userProcessContainer, City city, UserAccount userAccount, Organization organization, 
            Enterprise enterprise, EcoSystem system) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.system=system;  
        this.userAccount=userAccount;
        this.enterprise=enterprise;
        this.city=city;
        this.organization=organization;
        populateComboBox();
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtVaccineName = new javax.swing.JTextField();
        txtQty = new javax.swing.JTextField();
        cmbVaccineManufacturer = new javax.swing.JComboBox<>();
        btnSubmit = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        lblManufacturereAdmin = new javax.swing.JLabel();

        setBackground(new java.awt.Color(167, 199, 231));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Vaccine Name:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 250, -1, -1));

        jLabel3.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Manufacturer Name:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 300, -1, -1));

        jLabel4.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Quantity:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 350, -1, -1));

        txtVaccineName.setBackground(new java.awt.Color(214, 229, 244));
        txtVaccineName.setForeground(new java.awt.Color(0, 0, 0));
        txtVaccineName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtVaccineNameActionPerformed(evt);
            }
        });
        add(txtVaccineName, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 250, 129, -1));

        txtQty.setBackground(new java.awt.Color(214, 229, 244));
        txtQty.setForeground(new java.awt.Color(0, 0, 0));
        add(txtQty, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 340, 129, -1));

        cmbVaccineManufacturer.setBackground(new java.awt.Color(214, 229, 244));
        cmbVaccineManufacturer.setForeground(new java.awt.Color(0, 0, 0));
        cmbVaccineManufacturer.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sereum Institute", "Bharat BioTech", "Pfizer" }));
        add(cmbVaccineManufacturer, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 290, -1, -1));

        btnSubmit.setBackground(new java.awt.Color(0, 0, 0));
        btnSubmit.setForeground(new java.awt.Color(255, 255, 255));
        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });
        add(btnSubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 450, -1, -1));

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 150, -1, -1));

        lblManufacturereAdmin.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        lblManufacturereAdmin.setForeground(new java.awt.Color(0, 0, 0));
        lblManufacturereAdmin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblManufacturereAdmin.setText("ORDER VACCINE");
        add(lblManufacturereAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 140, 290, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void txtVaccineNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtVaccineNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtVaccineNameActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
    String vaccineName;
    int qty=0;
    String message = "Order placed";
    String status = "Active";
    
    vaccineName = txtVaccineName.getText();
    try{
    qty = Integer.parseInt(txtQty.getText());
    }
    catch(NumberFormatException e){
        JOptionPane.showMessageDialog(this,e);
    }
    String VaccineManufacturerName = (String) cmbVaccineManufacturer.getSelectedItem();
    for(City city : system.getCityList()){
        for (Enterprise e : city.getEnterpriseDirectory().getEnterpriseList()) {
            if((e.getName()).equals(VaccineManufacturerName)){
                UserAccount receiver = e.getUserAccountDirectory().getUserAccountList().get(0);
                Order order = e.getWorkQueue().addWorkRequestList(message, userAccount, receiver, status);
                order.setQuantity(qty);
                order.setVaccineName(vaccineName);
                //System.out.println(e.getWorkQueue().getWorkRequestList().get(0));
            }
            
        }
        }
    
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        VaccinationCenterAdminJPanel vaccinationCenterjp = (VaccinationCenterAdminJPanel) component;
        //        sysAdminwjp.populateTree();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSubmit;
    private javax.swing.JComboBox<String> cmbVaccineManufacturer;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lblManufacturereAdmin;
    private javax.swing.JTextField txtQty;
    private javax.swing.JTextField txtVaccineName;
    // End of variables declaration//GEN-END:variables

    private void populateComboBox() {
        cmbVaccineManufacturer.removeAllItems();
        for(City city : system.getCityList()){
        for (Enterprise e : city.getEnterpriseDirectory().getEnterpriseList()) {
            System.out.println(e.getClass().getName());
            if((e.getClass().getName()).equals("Business.Enterprise.VaccineManufacturer"))
            cmbVaccineManufacturer.addItem(e.getName());
        } //To change body of generated methods, choose Tools | Templates.
    }
    }
}
