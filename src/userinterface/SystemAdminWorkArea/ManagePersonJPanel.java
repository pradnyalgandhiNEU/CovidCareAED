/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface.SystemAdminWorkArea;

import Business.EcoSystem;
import Business.Person.Person;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.Component;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author pradnyalgandhi
 */
public class ManagePersonJPanel extends javax.swing.JPanel {

    /**
     * Creates new form MainPersonJPanel
     */
    JPanel userProcessContainer;
    EcoSystem ecosystem;
    public ManagePersonJPanel(JPanel userProcessContainer, EcoSystem ecosystem) {
        initComponents();
        this.ecosystem = ecosystem;
        this.userProcessContainer = userProcessContainer;

        populatePersonTable();
        btnUpdate.setEnabled(false);
        btnDelete.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtPhone = new javax.swing.JTextField();
        lblStreet = new javax.swing.JLabel();
        lblPhone = new javax.swing.JLabel();
        txtZipcode = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        lblApartment = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        txtCommunity = new javax.swing.JTextField();
        btnUpdate = new javax.swing.JButton();
        lblCommunity = new javax.swing.JLabel();
        btnView = new javax.swing.JButton();
        btnCreate = new javax.swing.JButton();
        lblManagePerson = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        personTable = new javax.swing.JTable();
        txtStreet = new javax.swing.JTextField();
        btnDelete = new javax.swing.JButton();
        txtID = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        lblID = new javax.swing.JLabel();
        txtAge = new javax.swing.JTextField();
        lblAge = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();

        lblStreet.setText("Street:");

        lblPhone.setText("Phone No:");

        lblApartment.setText("Zip Code:");

        lblEmail.setText("Email:");

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        lblCommunity.setText("Community:");

        btnView.setText("View");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });

        btnCreate.setText("Create");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        lblManagePerson.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        lblManagePerson.setForeground(new java.awt.Color(204, 204, 204));
        lblManagePerson.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblManagePerson.setText("Manage Person");

        lblName.setText("Name:");

        personTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Name", "ID", "Street", "Zipcode", "Age", "Community", "Phone No", "Email"
            }
        ));
        jScrollPane1.setViewportView(personTable);

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        lblID.setText("ID:");

        lblAge.setText("Age:");

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
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
                        .addComponent(lblManagePerson, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnView)
                .addGap(18, 18, 18)
                .addComponent(btnDelete)
                .addGap(42, 42, 42))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(291, 291, 291)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblAge)
                                .addGap(18, 18, 18)
                                .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblPhone, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblEmail, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(3, 3, 3)
                                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblCommunity)
                                .addGap(18, 18, 18)
                                .addComponent(txtCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(lblID)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblName)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(lblStreet)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtStreet, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblApartment)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtZipcode, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(351, 351, 351)
                        .addComponent(btnCancel)
                        .addGap(18, 18, 18)
                        .addComponent(btnUpdate)
                        .addGap(18, 18, 18)
                        .addComponent(btnCreate)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblManagePerson)
                    .addComponent(btnBack))
                .addGap(36, 36, 36)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnView)
                    .addComponent(btnDelete))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblID)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblStreet)
                    .addComponent(txtStreet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblApartment)
                    .addComponent(txtZipcode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAge)
                    .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPhone))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEmail))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCommunity)
                    .addComponent(txtCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUpdate)
                    .addComponent(btnCreate)
                    .addComponent(btnCancel))
                .addContainerGap(49, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        // TODO add your handling code here:
        int ID = Integer.parseInt(txtID.getText());
        String name = txtName.getText();
        String street = txtStreet.getText();
        String zipcode = txtZipcode.getText();
        int age = Integer.parseInt(txtAge.getText());
        String community = txtCommunity.getText();
        String phoneNo = txtPhone.getText();
        String email = txtEmail.getText();

        if (txtID.getText().isEmpty() || txtAge.getText().isEmpty() || name.isEmpty() || street.isEmpty() || zipcode.isEmpty() || community.isEmpty() || phoneNo.isEmpty() || email.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Empty Fields", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        else if (phoneNo.length() != 10) {
            JOptionPane.showMessageDialog(null, "Invalid Phone Number", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        else if (validateEmail(email) == false) {
            JOptionPane.showMessageDialog(null, "Invalid Email", "Warning", JOptionPane.WARNING_MESSAGE);
        }
        else if (zipcode.length() != 5) {
            JOptionPane.showMessageDialog(null, "Invalid Zipcode", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        else if(!ecosystem.getPersonDirectory().checkIfIDIsUnique(ID)){
            JOptionPane.showMessageDialog(null, String.format("Person ID %s already exists!", ID),"Warning",JOptionPane.ERROR_MESSAGE);
        }
        else if(!ecosystem.getPersonDirectory().checkIfNameIsUnique(name)){
            JOptionPane.showMessageDialog(null, String.format("Person name %s already exists!", name),"Warning",JOptionPane.ERROR_MESSAGE);
        }
        else if(!ecosystem.getPersonDirectory().checkIfEmailIsUnique(email)){
            JOptionPane.showMessageDialog(null, String.format("Person email %s already exists!", email),"Warning",JOptionPane.ERROR_MESSAGE);
        }
        else{
            ecosystem.getPersonDirectory().newPerson(ID, name, street, zipcode, age, community, phoneNo, email);
            populatePersonTable();
            JOptionPane.showMessageDialog(null, "Customer Created");
        }
        
//        System.out.println(ecosystem.getPersonDirectory().getPersonList());

        txtID.setText("");
        txtName.setText("");
        txtStreet.setText("");
        txtZipcode.setText("");
        txtAge.setText("");
        txtPhone.setText("");
        txtEmail.setText("");
        txtCommunity.setText("");

    }//GEN-LAST:event_btnCreateActionPerformed

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        // TODO add your handling code here:
        
        int selectedRow = personTable.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(this, "Please select a Row");
        } else {
            btnUpdate.setEnabled(true);
            btnDelete.setEnabled(true);
            txtID.setEnabled(false);
            DefaultTableModel model = (DefaultTableModel) personTable.getModel();
//            UserAccount selectedUser = (UserAccount) model.getValueAt(selectedRow, 0);
            Person selectedPerson = (Person) model.getValueAt(selectedRow, 0);
            txtID.setText(String.valueOf(selectedPerson.getPersonID()));
            txtName.setText(selectedPerson.getName());
            txtStreet.setText(selectedPerson.getStreet());
            txtZipcode.setText(selectedPerson.getZipcode());
            txtAge.setText(String.valueOf(selectedPerson.getAge()));
            txtPhone.setText(String.valueOf(selectedPerson.getPhoneNo()));
            txtEmail.setText(selectedPerson.getEmail());
            txtCommunity.setText(selectedPerson.getCommunity());

        }
        
    }//GEN-LAST:event_btnViewActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int selectedRow = personTable.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(this, "Please select a Row");
        } else {
            btnDelete.setEnabled(false);
            btnUpdate.setEnabled(false);
            
            DefaultTableModel model = (DefaultTableModel) personTable.getModel();
            Person selectedPerson = (Person) model.getValueAt(selectedRow, 0);

            ecosystem.getPersonDirectory().deletePerson(selectedPerson);

            populatePersonTable();
            
            txtID.setText("");
            txtName.setText("");
            txtStreet.setText("");
            txtZipcode.setText("");
            txtAge.setText("");
            txtPhone.setText("");
            txtEmail.setText("");
            txtCommunity.setText("");
            txtID.setEnabled(true);
    }//GEN-LAST:event_btnDeleteActionPerformed
    }
    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        txtID.setEnabled(false);
        int ID = Integer.parseInt(txtID.getText());
        String name = txtName.getText();
        String street = txtStreet.getText();
        String zipcode = txtZipcode.getText();
        int age = Integer.parseInt(txtAge.getText());
        String community = txtCommunity.getText();
        String phoneNo = txtPhone.getText();
        String email = txtEmail.getText();
        
        int selectedRow = personTable.getSelectedRow();
        if(selectedRow<0){
            JOptionPane.showMessageDialog(this, "Please select a Row");
            txtID.setEnabled(true);
        }
        else{
            btnDelete.setEnabled(false);
            btnUpdate.setEnabled(false);
            DefaultTableModel model = (DefaultTableModel) personTable.getModel();
            Person person = (Person)model.getValueAt(selectedRow, 0);
            
            if (txtID.getText().isEmpty() || txtAge.getText().isEmpty() || name.isEmpty() || street.isEmpty() || zipcode.isEmpty() || community.isEmpty() || phoneNo.isEmpty() || email.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Empty Fields", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        else if (phoneNo.length() != 10) {
            JOptionPane.showMessageDialog(null, "Invalid Phone Number", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        else if (validateEmail(email) == false) {
            JOptionPane.showMessageDialog(null, "Invalid Email", "Warning", JOptionPane.WARNING_MESSAGE);
        }
        else if (zipcode.length() != 5) {
            JOptionPane.showMessageDialog(null, "Invalid Zipcode", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
             
        
            else{
            ecosystem.getPersonDirectory().updatePerson(person, name, street, zipcode, age, community, phoneNo, email);
//            System.out.print(username);
            JOptionPane.showMessageDialog(this, " Person updated successfully");
            populatePersonTable();
            txtID.setText("");
            txtName.setText("");
            txtStreet.setText("");
            txtZipcode.setText("");
            txtAge.setText("");
            txtPhone.setText("");
            txtEmail.setText("");
            txtCommunity.setText("");
            txtID.setEnabled(true);
        }
            
        }
        
    }//GEN-LAST:event_btnUpdateActionPerformed

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

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        // TODO add your handling code here:
        txtID.setEnabled(true);
        btnUpdate.setEnabled(false);
        btnDelete.setEnabled(false);
        txtID.setText("");
        txtName.setText("");
        txtStreet.setText("");
        txtZipcode.setText("");
        txtAge.setText("");
        txtPhone.setText("");
        txtEmail.setText("");
        txtCommunity.setText("");
    }//GEN-LAST:event_btnCancelActionPerformed


    private boolean validateEmail(String email) {
        Pattern p = Pattern.compile("^[a-zA-z0-9]+@[a-zA-Z0-9]+.[a-zA-Z0-9]+$");
        Matcher m = p.matcher(email);
        return m.matches();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnView;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblApartment;
    private javax.swing.JLabel lblCommunity;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblManagePerson;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPhone;
    private javax.swing.JLabel lblStreet;
    private javax.swing.JTable personTable;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtCommunity;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPhone;
    private javax.swing.JTextField txtStreet;
    private javax.swing.JTextField txtZipcode;
    // End of variables declaration//GEN-END:variables

    private void populatePersonTable() {

        DefaultTableModel dtm = (DefaultTableModel) personTable.getModel();
        dtm.setRowCount(0);

        for (Person person : ecosystem.getPersonDirectory().getPersonList()) {
//            System.out.println(person);
            Object[] row = new Object[8];
            row[0] = person;
            row[1] = person.getPersonID();
            row[2] = person.getStreet();
            row[3] = person.getZipcode();
            row[4] = person.getAge();
            row[5] = person.getCommunity();
            row[6] = person.getPhoneNo();
            row[7] = person.getEmail();

            dtm.addRow(row);

        }

    }
}
