/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.Enterprise.Enterprise;
import Business.City.City;
import javax.swing.JPanel;

/**
 *
 * @author shreya.ghate
 */
public abstract class Role {
        public enum RoleType{
        Admin("Admin"),
        Doctor("Doctor"),
        Patient("Patient"),
        LabAdmin("Lab Admin");
        
        private final String value;
        
        private RoleType(String value){
            this.value = value;
        }

        public String getValue() {
            return this.value;
        }
    }
    
   public abstract JPanel createWorkArea(JPanel userProcessContainer, 
            UserAccount account, 
            Organization organization, 
            Enterprise enterprise, 
            EcoSystem business);
}
