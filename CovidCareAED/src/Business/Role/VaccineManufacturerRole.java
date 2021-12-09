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
import Business.Organization.VaccineManufactureAdmin;
import Business.UserAccount.UserAccount;
import UserInterface.VaccineManufacturerWorkArea.VaccineManufacturerAdminJPanel;
import javax.swing.JPanel;

/**
 *
 * @author shreya.ghate
 */
public class VaccineManufacturerRole extends Role {
    @Override
    public JPanel createWorkArea(JPanel mainWorkArea, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new VaccineManufacturerAdminJPanel(mainWorkArea, account, (VaccineManufactureAdmin)organization,enterprise);
    } 
}
