/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import UserInterface.DeliveryManagerWorkArea.DeliveryManagerJPanel;
import javax.swing.JPanel;

/**
 *
 * @author shreya.ghate
 */
public class DeliveryManagerRole extends Role{
    @Override
    public JPanel createWorkArea(JPanel mainWorkArea, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new DeliveryManagerJPanel(mainWorkArea, enterprise);
    }
}
