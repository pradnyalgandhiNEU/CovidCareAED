/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.Hospital.HospitalStaffJPanel;

/**
 *
 * @author shreya.ghate
 */
public class HospitalStaffRole extends Role {
    private EcoSystem system;
    
    @Override
    public JPanel createWorkArea(JPanel mainWorkArea,UserAccount account, EcoSystem system) {
        return new HospitalStaffJPanel(mainWorkArea, system);
    } 
}
