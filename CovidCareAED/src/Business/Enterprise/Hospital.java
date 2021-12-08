/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author shreya.ghate
 */

public class Hospital extends Enterprise {
    public Hospital (String ID, String name, String address, int phonenumber, String email, int totalbeds){
        super(ID, name, EnterpriseType.Hospital, address, phonenumber, email, totalbeds);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
    
}
