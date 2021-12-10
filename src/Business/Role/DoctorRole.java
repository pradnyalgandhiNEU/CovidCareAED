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
import userinterface.Hospital.ManagePatientJPanel;
import userinterface.Hospital.ManagePatientsDischargeJPanel;
import userinterface.VaccineManufacturer.ManageDeliveryManagerJPanel;

/**
 *
 * @author shreya.ghate
 */
public class DoctorRole extends Role {
    private EcoSystem system;
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, City city, UserAccount userAccount, Organization organization, 
            Enterprise enterprise, EcoSystem system) {
        return new ManagePatientsDischargeJPanel(userProcessContainer,city, userAccount, organization, enterprise, system);
    }  
}
