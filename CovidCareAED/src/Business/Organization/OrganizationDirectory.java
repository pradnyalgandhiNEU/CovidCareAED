/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Organization.Organization.Type;

import java.util.ArrayList;

/**
 *
 * @author shreya.ghate
 */
public class OrganizationDirectory {
    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createOrganization(Organization.Type type){
        Organization organization = null;
        if (type.getValue().equals(Organization.Type.DeliveryManager.getValue())){
            organization = new DeliveryManager();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.Type.Doctor.getValue())){
            organization = new Doctor();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.Type.HospitalAdmin.getValue())){
            organization = new HospitalAdmin();
            organizationList.add(organization);
        }else if (type.getValue().equals(Organization.Type.HospitalStaff.getValue())){
            organization = new HospitalStaff();
            organizationList.add(organization);
        }
        
        else if (type.getValue().equals(Organization.Type.LabAdmin.getValue())) {
            organization = new LabAdmin();
            organizationList.add(organization);
        }else if (type.getValue().equals(Organization.Type.TestingLabAdmin.getValue())) {
            organization = new TestingLabAdmin();
            organizationList.add(organization);
        }else if (type.getValue().equals(Organization.Type.VaccinationCenterAdmin.getValue())) {
            organization = new VaccinationCenterAdmin();
            organizationList.add(organization);
        }else if (type.getValue().equals(Organization.Type.VaccinationCenterStaff.getValue())) {
            organization = new VaccinationCenterStaff();
            organizationList.add(organization);
        }else if (type.getValue().equals(Organization.Type.VaccineManufacturerAdmin.getValue())) {
            organization = new VaccineManufactureAdmin();
            organizationList.add(organization);
        }
        return organization;
    }
}
