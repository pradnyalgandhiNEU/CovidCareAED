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

        btnCreate.setText("Create");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        txtUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsernameActionPerformed(evt);
            }
        });

        lblUsername.setText("Username:");

        lblPassword.setText("Password:");

        lblManageVaccinationCenter.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        lblManageVaccinationCenter.setForeground(new java.awt.Color(204, 204, 204));
        lblManageVaccinationCenter.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblManageVaccinationCenter.setText("Manage Enterprise Admins");

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

        comboEnterprise.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        lblEnterprise.setText("Select Enterprise:");

        lblCity.setText("Select City:");

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        comboboxCity.setFont(new java.awt.Font("Product Sans", 0, 18)); // NOI18N
        comboboxCity.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboboxCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboboxCityActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 988, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnBack)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblManageVaccinationCenter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(291, 291, 291)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblUsername)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(lblPassword)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblEnterprise)
                                    .addComponent(lblCity))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(comboEnterprise, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(comboboxCity, 0, 212, Short.MAX_VALUE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(441, 441, 441)
                        .addComponent(btnCreate)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblManageVaccinationCenter)
                    .addComponent(btnBack))
                .addGap(40, 40, 40)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCity)
                    .addComponent(comboboxCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEnterprise)
                    .addComponent(comboEnterprise, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUsername)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPassword)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(btnCreate)
                .addGap(212, 212, 212))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {comboEnterprise, comboboxCity});

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
                            //System.out.println(enterprise.getUserAccountDirectory());
                            role = new VaccinationCenterAdminRole();
                            UserAccount account = enterprise.getUserAccountDirectory().createUserAccount(username, password, employee, role);
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
//        sysAdminwjp.populateTree();
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
