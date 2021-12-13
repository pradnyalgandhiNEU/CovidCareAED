/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea;

import Business.City.City;
import Business.EcoSystem;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author shreya.ghate
 */
public class ManageCityJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageHospitalJPanel
     */
    JPanel userProcessContainer;
    EcoSystem ecosystem;
    public ManageCityJPanel(JPanel userProcessContainer, EcoSystem ecosystem) {
        initComponents();
        this.ecosystem = ecosystem;
        this.userProcessContainer = userProcessContainer;
        populateCityTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblNewVaccinationCenter = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        btnCreate = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnBack = new javax.swing.JButton();

        setBackground(new java.awt.Color(167, 199, 231));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblNewVaccinationCenter.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        lblNewVaccinationCenter.setForeground(new java.awt.Color(0, 0, 0));
        lblNewVaccinationCenter.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNewVaccinationCenter.setText("Manage City");
        add(lblNewVaccinationCenter, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 110, 580, -1));

        lblName.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        lblName.setForeground(new java.awt.Color(0, 0, 0));
        lblName.setText("City Name:");
        add(lblName, new org.netbeans.lib.awtextra.AbsoluteConstraints(542, 435, -1, -1));

        txtName.setBackground(new java.awt.Color(214, 229, 244));
        add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(625, 432, 220, -1));

        btnCreate.setBackground(new java.awt.Color(0, 0, 0));
        btnCreate.setForeground(new java.awt.Color(255, 255, 255));
        btnCreate.setText("Create");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });
        add(btnCreate, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 490, -1, -1));

        jTable1.setBackground(new java.awt.Color(214, 229, 244));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "City"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(315, 166, 660, 197));

        btnBack.setBackground(new java.awt.Color(0, 0, 0));
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 110, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        // TODO add your handling code here:
        String name = txtName.getText();
        
        City city = ecosystem.createCity();
        city.setName(name);
        
        populateCityTable();
        txtName.setText("");
    }//GEN-LAST:event_btnCreateActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        SystemAdminWorkAreaJPanel sysAdminwjp = (SystemAdminWorkAreaJPanel) component;
        sysAdminwjp.populateTree();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);

    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCreate;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblNewVaccinationCenter;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables

    private void populateCityTable() {
        DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
        dtm.setRowCount(0);
        
        for(City city: ecosystem.getCityList()){
            Object[] row = new Object[1];
            row[0] = city.getName();
            dtm.addRow(row);
        }
    }
}
