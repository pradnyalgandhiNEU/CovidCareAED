/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import static Business.Organization.Organization.Type.Patient;
import Business.Organization.Patient;
import Business.UserAccount.UserAccount;
import UserInterface.PersonWorkArea.PersonWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author shreya.ghate
 */
public class PatientRole extends Role {
    @Override
    public JPanel createWorkArea(JPanel mainWorkArea, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new PersonWorkAreaJPanel(mainWorkArea, account, (Patient)organization, enterprise);
    }
}
