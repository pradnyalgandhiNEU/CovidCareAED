/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface.SystemAdminWorkArea;

import Business.City.City;
import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Role.HospitalAdminRole;
import Business.Role.Role;
import Business.Role.TestingLabAdminRole;
import Business.Role.VaccinationCenterAdminRole;
import Business.Role.VaccineManufacturerRole;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author pradnyalgandhi
 */
public class ManageEnterpriseAdminsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageVaccinationCenterJPanel
     */
    JPanel userProcessContainer;
    EcoSystem ecosystem;

    public ManageEnterpriseAdminsJPanel(JPanel userProcessContainer, EcoSystem ecosystem) {
        initComponents();
        this.ecosystem = ecosystem;
        this.userProcessContainer = userProcessContainer;
        populateCityComboBox();
        populateEnterpriseAdminTable();
    }

    private void populateCityComboBox(){
        comboboxCity.removeAllItems();
        
        for (City city : ecosystem.getCityList()){
            comboboxCity.addItem(city);
        }
    }
    private void populateEnterpriseCombo(City city) {
        comboEnterprise.removeAllItems();
        for (Enterprise enterprise : city.getEnterpriseDirectory().getEnterpriseList()) {
            comboEnterprise.addItem(enterprise.getName());
        }
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
        btnCreate = new javax.swing.JButton();
        txtUsername = new javax.swing.JTextField();
        lblUsername = new javax.swing.JLabel();
        txtPassword = new javax.swing.JTextField();
        lblPassword = new javax.swing.JLabel();
        lblManageVaccinationCenter = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        enterpriseTable = new javax.swing.JTable();
        comboEnterprise = new javax.swing.JComboBox<>();
        lblEnterprise = new javax.swing.JLabel();
        lblCity = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        comboboxCity = new javax.swing.JComboBox();

        jLabel1.setText("jLabel1");

        setBackground(new java.awt.Color(167, 199, 231));
        setForeground(new java.awt.Color(0, 0, 0));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnCreate.setBackground(new java.awt.Color(0, 0, 0));
        btnCreate.setForeground(new java.awt.Color(255, 255, 255));
        btnCreate.setText("Create");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });
        add(btnCreate, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 630, -1, -1));

        txtUsername.setBackground(new java.awt.Color(214, 229, 244));
        txtUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsernameActionPerformed(evt);
            }
        });
        add(txtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 540, 212, 30));

        lblUsername.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        lblUsername.setForeground(new java.awt.Color(0, 0, 0));
        lblUsername.setText("Username:");
        add(lblUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 550, -1, -1));

        txtPassword.setBackground(new java.awt.Color(214, 229, 244));
        add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 580, 212, 30));

        lblPassword.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        lblPassword.setForeground(new java.awt.Color(0, 0, 0));
        lblPassword.setText("Password:");
        add(lblPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 590, -1, -1));

        lblManageVaccinationCenter.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        lblManageVaccinationCenter.setForeground(new java.awt.Color(0, 0, 0));
        lblManageVaccinationCenter.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblManageVaccinationCenter.setText("MANAGE ENTERPRISE ADMINS");
        add(lblManageVaccinationCenter, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 62, 1210, -1));

        enterpriseTable.setBackground(new java.awt.Color(214, 229, 244));
        enterpriseTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "City", "Enterprise", "Username", "Password"
            }
        ));
        jScrollPane1.setViewportView(enterpriseTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(104, 133, 1100, 183));

        comboEnterprise.setBackground(new java.awt.Color(214, 229, 244));
        comboEnterprise.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(comboEnterprise, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 490, 212, 28));

        lblEnterprise.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        lblEnterprise.setForeground(new java.awt.Color(0, 0, 0));
        lblEnterprise.setText("Select Enterprise:");
        add(lblEnterprise, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 500, -1, -1));

        lblCity.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        lblCity.setForeground(new java.awt.Color(0, 0, 0));
        lblCity.setText("Select City:");
        add(lblCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 450, -1, -1));

        btnBack.setBackground(new java.awt.Color(0, 0, 0));
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, -1, -1));

        comboboxCity.setBackground(new java.awt.Color(214, 229, 244));
        comboboxCity.setFont(new java.awt.Font("Product Sans", 0, 18)); // NOI18N
        comboboxCity.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboboxCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboboxCityActionPerformed(evt);
            }
        });
        add(comboboxCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 440, 212, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        // TODO add your handling code here:
//        Enterprise enterprise = (Enterprise) comboEnterprise.getSelectedItem();
//        String city = txtCityName.getText();
        for (City cities : ecosystem.getCityList()) {
//            if (cities.getName().equals(city)) {
                for (Enterprise enterprise : cities.getEnterpriseDirectory().getEnterpriseList()) {
                    if (comboEnterprise.getSelectedItem().toString().equals(enterprise.getName())) {
                        String username = txtUsername.getText();
                        String password = txtPassword.getText();

                        if (enterprise.getUserAccountDirectory().authenticateUser(username, password) != null) {
                            JOptionPane.showMessageDialog(null, "Username Already exists");
                            return;
                        }

                        if (username.equals("") || password.equals("")) {
                            JOptionPane.showMessageDialog(null, "Username and password can not be empty");
                            return;
                        }


                        Employee employee = enterprise.getEmployeeDirectory().createEmployee(username);
                        //System.out.println(employee);
                        //System.out.println(enterprise.getClass().getName().toString() == "Business.Enterprise.VaccinationCenter");
                        Role role;

                        if (enterprise.getClass().getName().toString() == "Business.Enterprise.Hospital") {
                            role = new HospitalAdminRole();
                            UserAccount account = enterprise.getUserAccountDirectory().createUserAccount(username, password, employee, role);
                            //System.out.println(account);
                        } else if (enterprise.getClass().getName().toString() == "Business.Enterprise.TestingLab") {
                            role = new TestingLabAdminRole();
                            UserAccount account = enterprise.getUserAccountDirectory().createUserAccount(username, password, employee, role);
                        } else if (enterprise.getClass().getName().toString() == "Business.Enterprise.VaccinationCenter") {
                            int count = 0;
                            for(UserAccount userAccount: enterprise.getUserAccountDirectory().getUserAccountList()){
                                if((userAccount.getRole().getClass().getName()).equals("Business.Role.VaccinationCenterAdminRole")){
                                    count = 1;
                                }
                            }
                            if(count==0){
                            role = new VaccinationCenterAdminRole();
                            UserAccount account = enterprise.getUserAccountDirectory().createUserAccount(username, password, employee, role);
                            }
                            else{
                                JOptionPane.showMessageDialog(this,"Admin Already exist");
                            }
                        } else if (enterprise.getClass().getName().toString() == "Business.Enterprise.VaccineManufacturer") {
                            int count = 0;
                            for(UserAccount userAccount: enterprise.getUserAccountDirectory().getUserAccountList()){
                                if((userAccount.getRole().getClass().getName()).equals("Business.Role.VaccineManufacturerRole")){
                                    count = 1;
                                }
                            }
                            if(count==0){
                            role = new VaccineManufacturerRole();
                            UserAccount account = enterprise.getUserAccountDirectory().createUserAccount(username, password, employee, role);
                            }
                            else{
                                JOptionPane.showMessageDialog(this,"Admin Already exist");
                            }
                        }
                         
                        //UserAccount account = enterprise.getUserAccountDirectory().createUserAccount(username, password, employee, role);
                        //System.out.println(account);
                        populateEnterpriseAdminTable();

                    } 
                }
        }
        //populateEnterpriseAdminTable();
        txtUsername.setText("");
        txtPassword.setText("");
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

    private void txtUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsernameActionPerformed

    private void comboboxCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboboxCityActionPerformed
        City city = (City) comboboxCity.getSelectedItem();
        if (city != null){
            populateEnterpriseCombo(city);
        }
    }//GEN-LAST:event_comboboxCityActionPerformed

    private boolean validateUsername(String email) {
        Pattern p = Pattern.compile("^[a-zA-z0-9]+@[a-zA-Z0-9]+.[a-zA-Z0-9]+$");
        Matcher m = p.matcher(email);
        return m.matches();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCreate;
    private javax.swing.JComboBox<String> comboEnterprise;
    private javax.swing.JComboBox comboboxCity;
    private javax.swing.JTable enterpriseTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCity;
    private javax.swing.JLabel lblEnterprise;
    private javax.swing.JLabel lblManageVaccinationCenter;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables

    private void populateEnterpriseAdminTable() {
        DefaultTableModel dtm = (DefaultTableModel) enterpriseTable.getModel();
        dtm.setRowCount(0);

        for (City city : ecosystem.getCityList()) {
            for (Enterprise enterprise : city.getEnterpriseDirectory().getEnterpriseList()) {
                for (UserAccount userAccount : enterprise.getUserAccountDirectory().getUserAccountList()) {
                    Object[] row = new Object[4];
                    row[0] = city.getName();
                    row[1] = enterprise.getName();
                    row[2] = userAccount.getUsername();
                    row[3] = userAccount.getPassword();

                    dtm.addRow(row);
                }
            }
        }
    }
}
