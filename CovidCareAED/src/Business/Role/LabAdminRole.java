/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.City.City;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author shreya.ghate
 */
public class LabAdminRole {
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer,City city, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new LabAdminWorkAreaJPanel(userProcessContainer, account, organization, enterprise);
    } 
}
