/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.SystemAdminWorkArea.SystemAdminWorkAreaJPanel;

/**
 *
 * @author shreya.ghate
 */
public class DeliveryManagerRole extends Role {
    private EcoSystem system;
    
    @Override
    public JPanel createWorkArea(JPanel mainWorkArea,UserAccount account, EcoSystem system) {
        return new DeliveryManagerWorkAreaJPanel(mainWorkArea, system);
    } 
    
}
