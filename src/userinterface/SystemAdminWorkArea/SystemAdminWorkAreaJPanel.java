/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea;

import Business.City.City;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;

import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

/**
 *
 * @author MyPC1
 */
public class SystemAdminWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SystemAdminWorkAreaJPanel
     */
    JPanel userProcessContainer;
    EcoSystem system;
    UserAccount userAccount;
    City city;
    Organization organization;
    Enterprise enterprise;
    public SystemAdminWorkAreaJPanel(JPanel userProcessContainer, City city, UserAccount userAccount, Organization organization, 
            Enterprise enterprise, EcoSystem system) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.system=system;  
        this.userAccount=userAccount;
        this.enterprise=enterprise;
        this.city=city;
        this.organization=organization;
       
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    private void jTreeValueChanged(javax.swing.event.TreeSelectionEvent evt) {                                   
        
    }          
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnManageCity = new javax.swing.JButton();
        btnManageEnterprise = new javax.swing.JButton();
        btnManagePerson = new javax.swing.JButton();
        btnManageEnterpriseAdmins = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTree1 = new javax.swing.JTree();

        setBackground(new java.awt.Color(167, 199, 231));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnManageCity.setBackground(new java.awt.Color(0, 0, 0));
        btnManageCity.setForeground(new java.awt.Color(255, 255, 255));
        btnManageCity.setText("Manage City");
        btnManageCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageCityActionPerformed(evt);
            }
        });
        add(btnManageCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 253, 190, 30));

        btnManageEnterprise.setBackground(new java.awt.Color(0, 0, 0));
        btnManageEnterprise.setForeground(new java.awt.Color(255, 255, 255));
        btnManageEnterprise.setText("Manage Enterprises");
        btnManageEnterprise.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageEnterpriseActionPerformed(evt);
            }
        });
        add(btnManageEnterprise, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 330, 190, 30));

        btnManagePerson.setBackground(new java.awt.Color(0, 0, 0));
        btnManagePerson.setForeground(new java.awt.Color(255, 255, 255));
        btnManagePerson.setText("Manage Person");
        btnManagePerson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManagePersonActionPerformed(evt);
            }
        });
        add(btnManagePerson, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 510, 190, 30));

        btnManageEnterpriseAdmins.setBackground(new java.awt.Color(0, 0, 0));
        btnManageEnterpriseAdmins.setForeground(new java.awt.Color(255, 255, 255));
        btnManageEnterpriseAdmins.setText("Manage Enterprise Admins");
        btnManageEnterpriseAdmins.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageEnterpriseAdminsActionPerformed(evt);
            }
        });
        add(btnManageEnterpriseAdmins, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 420, -1, 30));

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("WELCOME, SYSTEM ADMIN");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 160, 900, -1));

        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Create Person ");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 550, -1, -1));

        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Create a New City");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 290, -1, -1));

        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("Create a New Enterprise in City");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 370, -1, -1));

        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("Create Admins of City Enterprise");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 460, -1, -1));

        jTree1.setBackground(new java.awt.Color(94, 153, 211));
        jTree1.setForeground(new java.awt.Color(0, 0, 0));
        jTree1.setMinimumSize(new java.awt.Dimension(0, 860));
        jScrollPane1.setViewportView(jTree1);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 140, 860));
    }// </editor-fold>//GEN-END:initComponents
    
    
    private void btnManagePersonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManagePersonActionPerformed
        ManagePersonJPanel managePerson = new ManagePersonJPanel(userProcessContainer, system);
        userProcessContainer.add("managePerson", managePerson);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        
    }//GEN-LAST:event_btnManagePersonActionPerformed

    private void btnManageEnterpriseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageEnterpriseActionPerformed
        ManageEnterprisesJPanel manageTestCenterJPanel = new ManageEnterprisesJPanel(userProcessContainer, system);
        userProcessContainer.add("manageTestCenterJPanel", manageTestCenterJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManageEnterpriseActionPerformed

    private void btnManageCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageCityActionPerformed
        ManageCityJPanel manageHospitalJPanel = new ManageCityJPanel(userProcessContainer, system);
        userProcessContainer.add("manageHospitalJPanel", manageHospitalJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManageCityActionPerformed

    private void btnManageEnterpriseAdminsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageEnterpriseAdminsActionPerformed
       ManageEnterpriseAdminsJPanel manageVaccinationCenterJPanel = new ManageEnterpriseAdminsJPanel(userProcessContainer, system);
       userProcessContainer.add("manageVaccinationCenterJPanel", manageVaccinationCenterJPanel);
       CardLayout layout = (CardLayout) userProcessContainer.getLayout();
       layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManageEnterpriseAdminsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnManageCity;
    private javax.swing.JButton btnManageEnterprise;
    private javax.swing.JButton btnManageEnterpriseAdmins;
    private javax.swing.JButton btnManagePerson;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTree jTree1;
    // End of variables declaration//GEN-END:variables
}
