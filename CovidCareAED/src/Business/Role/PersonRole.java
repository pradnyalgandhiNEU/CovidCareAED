/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.City.City;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.LabAdmin;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import UserInterface.TestingCenterWorkArea.LabAdminJPanel;
import javax.swing.JPanel;

/**
 *
 * @author shreya.ghate
 */
public class PersonRole extends Role{
    @Override
    public JPanel createWorkArea(JPanel mainWorkArea, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new LabAdminJPanel(mainWorkArea, account, organization,enterprise);
    }  
}
