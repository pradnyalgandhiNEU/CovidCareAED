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
import static Business.Organization.Organization.Type.VaccinationCenterStaff;
import Business.Organization.VaccinationCenterStaff;
import Business.UserAccount.UserAccount;
import UserInterface.VaccinationCenterStaffWorkArea.ManagePatientVaccineJPanel;
import UserInterface.VaccinationCenterWorkArea.VaccinationCenterAdminJPanel;
import javax.swing.JPanel;

/**
 *
 * @author shreya.ghate
 */
public class VaccinationCenterStaffRole extends Role{
    @Override
    public JPanel createWorkArea(JPanel mainWorkArea, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new ManagePatientVaccineJPanel(mainWorkArea, account, (VaccinationCenterStaff)organization,enterprise);
    }  
}
