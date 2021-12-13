/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.VaccinationCenter;

import Business.City.City;
import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Employee.EmployeeDirectory;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Person.Person;
import Business.Person.PersonDirectory;
import Business.Role.Role;
import Business.Role.VaccinationCenterAdminRole;
import Business.Role.VaccinationCenterStaffRole;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ayushgupta
 */
public class ManageVaccinationCenterStaffJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageVacciantionCenterStaff
     */
    JPanel userProcessContainer;
    EcoSystem system;
    UserAccount userAccount;
    Organization organization;
    Enterprise enterprise;
    City city;
    EmployeeDirectory employeeDirectory;
    public ManageVaccinationCenterStaffJPanel(JPanel userProcessContainer, City city, UserAccount userAccount, Organization organization, 
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
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblStaff = new javax.swing.JTable();
        btnView = new javax.swing.JButton();
        txtStaffID = new javax.swing.JTextField();
        lblStaffID = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        lblName = new javax.swing.JLabel();
        btnUpdate = new javax.swing.JButton();
        btnCreate = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtUserName = new javax.swing.JTextField();
        txtPassword = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        lblManageInventory = new javax.swing.JLabel();
        btnView1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(167, 199, 231));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setBackground(new java.awt.Color(214, 229, 244));
        jScrollPane1.setForeground(new java.awt.Color(0, 0, 0));

        tblStaff.setBackground(new java.awt.Color(214, 229, 244));
        tblStaff.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "UserName", "Staff ID", "Name", "Password"
            }
        ));
        jScrollPane1.setViewportView(tblStaff);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, 988, 183));

        btnView.setBackground(new java.awt.Color(0, 0, 0));
        btnView.setForeground(new java.awt.Color(255, 255, 255));
        btnView.setText("View");
        add(btnView, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 370, -1, -1));

        txtStaffID.setBackground(new java.awt.Color(214, 229, 244));
        txtStaffID.setForeground(new java.awt.Color(0, 0, 0));
        add(txtStaffID, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 440, 212, -1));

        lblStaffID.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        lblStaffID.setForeground(new java.awt.Color(0, 0, 0));
        lblStaffID.setText("Staff ID:");
        add(lblStaffID, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 440, -1, -1));

        txtName.setBackground(new java.awt.Color(214, 229, 244));
        txtName.setForeground(new java.awt.Color(0, 0, 0));
        add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 480, 212, -1));

        lblName.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        lblName.setForeground(new java.awt.Color(0, 0, 0));
        lblName.setText("Name:");
        add(lblName, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 480, -1, -1));

        btnUpdate.setBackground(new java.awt.Color(0, 0, 0));
        btnUpdate.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdate.setText("Update");
        add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 600, -1, -1));

        btnCreate.setBackground(new java.awt.Color(0, 0, 0));
        btnCreate.setForeground(new java.awt.Color(255, 255, 255));
        btnCreate.setText("Create");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });
        add(btnCreate, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 600, -1, -1));

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("UserName");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 520, -1, -1));

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Password");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 570, -1, -1));

        txtUserName.setBackground(new java.awt.Color(214, 229, 244));
        txtUserName.setForeground(new java.awt.Color(0, 0, 0));
        add(txtUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 520, 212, -1));

        txtPassword.setBackground(new java.awt.Color(214, 229, 244));
        txtPassword.setForeground(new java.awt.Color(0, 0, 0));
        add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 560, 212, -1));

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 120, -1, -1));

        lblManageInventory.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        lblManageInventory.setForeground(new java.awt.Color(0, 0, 0));
        lblManageInventory.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblManageInventory.setText("VACCINATION CENTER STAFF");
        add(lblManageInventory, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 110, 620, -1));

        btnView1.setBackground(new java.awt.Color(0, 0, 0));
        btnView1.setForeground(new java.awt.Color(255, 255, 255));
        btnView1.setText("Delete");
        add(btnView1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 370, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        Employee employee = enterprise.getEmployeeDirectory().createEmployee(txtName.getText());
        String userName = txtUserName.getText();
        String password = txtPassword.getText();
        if (enterprise.getUserAccountDirectory().authenticateUser(userName, password) != null) {
                JOptionPane.showMessageDialog(null, "Username Already exists");
                    return;
        }

        if (userName.equals("") || password.equals("")) {
               JOptionPane.showMessageDialog(null, "Username and password can not be empty");
                    return;
        }
        Role role = new VaccinationCenterStaffRole();
        UserAccount account = enterprise.getUserAccountDirectory().createUserAccount(userName, password, employee, role);
                     
       populateTable();

                        
        
    }//GEN-LAST:event_btnCreateActionPerformed

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
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnView;
    private javax.swing.JButton btnView1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblManageInventory;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblStaffID;
    private javax.swing.JTable tblStaff;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtStaffID;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        DefaultTableModel dtm = (DefaultTableModel) tblStaff.getModel();
        dtm.setRowCount(0);

            
                for (UserAccount userAccount : enterprise.getUserAccountDirectory().getUserAccountList()) {
                    if("Business.Role.VaccinationCenterStaffRole".equals(userAccount.getRole().getClass().getName())){
                    System.out.println(userAccount.getRole());
                    Object[] row = new Object[4];
                    row[0] = userAccount;
                    row[1] = userAccount.getEmployee().getId();
                    row[2] = userAccount.getEmployee().getName();
                    row[3] = userAccount.getPassword();

                    dtm.addRow(row);
                }
                }//To change body of generated methods, choose Tools | Templates.
    }
}
