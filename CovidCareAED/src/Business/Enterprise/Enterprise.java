/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;

/**
 *
 * @author shreya.ghate
 */
public abstract class Enterprise extends Organization {
    private EnterpriseType enterpriseType;
    private String enterpriseId;

    public String getEnterpriseId() {
        return enterpriseId;
    }

    public void setEnterpriseId(String enterpriseId) {
        this.enterpriseId = enterpriseId;
    }
    private OrganizationDirectory organizationDirectory;

    public OrganizationDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }
    
    public enum EnterpriseType{
        Hospital("Hospital"),
        TestingLab("TestingLab"),
        VaccinationCenter("VaccinationCenter"), 
        VaccineManufacturer("VaccineManufacturer");  
        
        private String value;
        
        private EnterpriseType(String value){
            this.value=value;
        }
        public String getValue() {
            return value;
        }
        @Override
        public String toString(){
            return value;
        }
    }

    public EnterpriseType getEnterpriseType() {
        return enterpriseType;
    }

    public void setEnterpriseType(EnterpriseType enterpriseType) {
        this.enterpriseType = enterpriseType;
    }
    
    public Enterprise(EnterpriseType type, String ID, String name, String address, int phonenumber, String email, int totalbeds){
        super(type.toString(),ID, name, address, phonenumber, email, totalbeds);
        this.enterpriseType=type;
        organizationDirectory=new OrganizationDirectory();
    }
}
