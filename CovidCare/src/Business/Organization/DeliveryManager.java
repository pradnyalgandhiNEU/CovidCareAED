/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.DeliveryManagerRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author shreya.ghate
 */
public class DeliveryManager extends Organization {

    public DeliveryManager(String ID, String name, String address, int phonenumber, String email, int totalbeds) {
        super(Type.DeliveryManager.getValue(), ID, name, address, phonenumber, email, totalbeds);
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new DeliveryManagerRole());
        return roles;
    }
     
}

