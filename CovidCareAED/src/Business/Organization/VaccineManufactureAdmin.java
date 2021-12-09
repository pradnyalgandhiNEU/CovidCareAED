/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.Role;
import Business.Role.VaccineManufacturerRole;
import java.util.ArrayList;

/**
 *
 * @author ayushgupta
 */
public class VaccineManufactureAdmin extends Organization {
    public VaccineManufactureAdmin(String ID, String name, String address, int phonenumber, String email, int totalbeds) {
        super(Type.VaccineManufacturerAdmin.getValue(), ID, name, address, phonenumber, email, totalbeds);
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new VaccineManufacturerRole());
        return roles;
    }
}
