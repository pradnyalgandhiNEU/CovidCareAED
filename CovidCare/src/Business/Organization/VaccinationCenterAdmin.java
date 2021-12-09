/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.Role;
import Business.Role.VaccinationCenterAdminRole;
import java.util.ArrayList;

/**
 *
 * @author ayushgupta
 */
public class VaccinationCenterAdmin extends Organization {
    public VaccinationCenterAdmin(String ID, String name, String address, int phonenumber, String email, int totalbeds) {
        super(Type.VaccinationCenterAdmin.getValue(), ID, name, address, phonenumber, email, totalbeds);
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new VaccinationCenterAdminRole());
        return roles;
    }
}
