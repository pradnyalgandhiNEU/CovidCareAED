/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Role;

import Business.City.City;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.MainAdminWorkArea.MainAdminJPanel;
import userinterface.VaccineManufacturer.ManageDeliveryManagerJPanel;

/**
 *
 * @author pradnyalgandhi
 */
public class MainAdmin extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, City city, UserAccount userAccount, Organization organization, 
            Enterprise enterprise, EcoSystem system) {
        return new MainAdminJPanel(userProcessContainer,city, userAccount, organization, enterprise, system);
    } 

    
}
