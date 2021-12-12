/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.Hospital;

import Business.City.City;
import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Employee.EmployeeDirectory;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Role.DoctorRole;
import Business.Role.Role;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import userinterface.SystemAdminWorkArea.SystemAdminWorkAreaJPanel;

/**
 *
 * @author shreya.ghate
 */
public class ManageDoctorJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageDoctorJPanel
     */
    JPanel userProcessContainer;
    EcoSystem system;
    UserAccount userAccount;
    Organization organization;
    Enterprise enterprise;
    City city;
    EmployeeDirectory employeeDirectory;
    public ManageDoctorJPanel(JPanel userProcessContainer, City city, UserAccount userAccount, Organization organization, 
            Enterprise enterprise, EcoSystem system) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.system=system;  
        this.userAccount=userAccount;
        this.enterprise=enterprise;
        this.city=city;
        this.organization=organization;
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

        lblManageManufacturer = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDoctor = new javax.swing.JTable();
        btnView = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        txtName = new javax.swing.JTextField();
        lblName = new javax.swing.JLabel();
        btnUpdate = new javax.swing.JButton();
        btnCreate = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtUserName = new javax.swing.JTextField();
        txtPassword = new javax.swing.JTextField();
        txtStaffID = new javax.swing.JTextField();
        lblStaffID = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();

        lblManageManufacturer.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        lblManageManufacturer.setForeground(new java.awt.Color(204, 204, 204));
        lblManageManufacturer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblManageManufacturer.setText("Manage Doctor");

        tblDoctor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Username", "Doctor ID", "Name", "Password"
            }
        ));
        jScrollPane1.setViewportView(tblDoctor);

        btnView.setText("View");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");

        lblName.setText("Name:");

        btnUpdate.setText("Update");

        btnCreate.setText("Create");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        jLabel1.setText("UserName");

        jLabel2.setText("Password");

        lblStaffID.setText("Doctor ID:");

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblStaffID)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(lblName))
                                .addGap(2, 2, 2)))
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtStaffID)
                            .addComponent(txtName)
                            .addComponent(txtUserName)
                            .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(btnUpdate)
                        .addGap(65, 65, 65)
                        .addComponent(btnCreate)))
                .addGap(322, 322, 322))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblManageManufacturer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 994, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 772, Short.MAX_VALUE)
                        .addComponent(btnView)
                        .addGap(18, 18, 18)
                        .addComponent(btnDelete)
                        .addGap(45, 45, 45))))
            .addGroup(layout.createSequentialGroup()
                .addComponent(btnBack)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(btnBack)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblManageManufacturer)
                .addGap(108, 108, 108)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnView)
                    .addComponent(btnDelete))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblStaffID, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtStaffID, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUpdate)
                    .addComponent(btnCreate))
                .addGap(125, 125, 125))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnViewActionPerformed

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
        Role role = new DoctorRole();
        UserAccount account = enterprise.getUserAccountDirectory().createUserAccount(userName, password, employee, role);
        System.out.println(account);
        populateTable();
    }//GEN-LAST:event_btnCreateActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        HospitalAdminJPanel sysAdminwjp = (HospitalAdminJPanel) component;
        //        sysAdminwjp.populateTree();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnView;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblManageManufacturer;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblStaffID;
    private javax.swing.JTable tblDoctor;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtStaffID;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables

          private void populateTable() {
        DefaultTableModel dtm = (DefaultTableModel) tblDoctor.getModel();
        dtm.setRowCount(0);

            
                for (UserAccount userAccount : enterprise.getUserAccountDirectory().getUserAccountList()) {
                    if("Business.Role.DoctorRole".equals(userAccount.getRole().getClass().getName())){
                    System.out.println(userAccount.getRole());
                    Object[] row = new Object[4];
                    row[0] = userAccount;
                    row[1] = userAccount.getEmployee().getId();
                    row[2] = userAccount.getEmployee().getName();
                    row[3] = userAccount.getPassword();

                    dtm.addRow(row);
                }
                }
    }

}
