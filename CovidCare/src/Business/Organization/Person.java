/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.LabAdminRole;
import Business.Role.PersonRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author shreya.ghate
 */
public class Person extends Organization {
    public Person(String ID, String name, String address, int phonenumber, String email, int totalbeds) {
        super(Organization.Type.Person.getValue(), ID, name, address, phonenumber, email, totalbeds);
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new PersonRole());
        return roles;
    } 
}
