/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Employee.EmployeeDirectory;
import Business.Role.Role;
import Business.UserAccount.UserAccountDirectory;
import Business.WorkQueue.WorkQueue;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author shreya.ghate
 */
public abstract class Organization {
 
    private String type;
    private String ID;
    private String name;
    private String address;
    private int phonenumber;
    private String email;
    private int totalbeds;
    private WorkQueue workQueue;
    private EmployeeDirectory employeeDirectory;
    private UserAccountDirectory userAccountDirectory;
    private int organizationID;
    private static int counter=1;
    
    public enum Type{
        DeliveryManager("Delivery Manager"),
        Doctor("Doctor"),
        HospitalAdmin("Hospital Admin"),
        HospitalStaff("Hospital Staff"), 
        LabAdmin("Lab Admin"),
        TestingLabAdmin("Testing Lab Admin"),
        VaccinationCenterAdmin("Vaccination Center Admin"), 
        VaccinationCenterStaff("Vaccination Center Staff"), 
        VaccineManufacturerAdmin("Vaccine Manufacturer Admin"), 
        Patient("Patient"),
        Person("Person"),
        SystemAdmin("System Admin");
        
        private final String value;
        
        private Type(String value) {
            this.value = value;
        }
        
        public String getValue() {
            return value;
        }
    }

    public Organization(String type, String ID, String name, String address, int phonenumber, String email, int totalbeds) {
        this.name = name;
        this.ID = ID;
        this.type = type;
        this.address = address;
        this.email = email;
        this.phonenumber = phonenumber;
        this.totalbeds = totalbeds;
        this.workQueue = new WorkQueue();
        this.employeeDirectory = new EmployeeDirectory();
        this.userAccountDirectory = new UserAccountDirectory();
        this.organizationID = counter++;
    }

    public abstract ArrayList<Role> getSupportedRole();
    
    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }
   
    public int getOrganizationID() {
        return organizationID;
    }

    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }
    
    public String getName() {
        return name;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(int phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTotalbeds() {
        return totalbeds;
    }

    public void setTotalbeds(int totalbeds) {
        this.totalbeds = totalbeds;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        Organization.counter = counter;
    }

    @Override
    public String toString() {
        return name;
    }
}
