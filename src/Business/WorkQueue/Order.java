/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.City.City;
import Business.Organization.VaccineManufacturerOrganization;
import Business.UserAccount.UserAccount;

/**
 *
 * @author ayushgupta
 */
public class Order extends WorkRequest{
    //private City city;
    private int quantity;
    private String VaccineName;
    //private VaccineManufacturerOrganization vaccineManufacturer;

    public String getVaccineName() {
        return VaccineName;
    }

    public void setVaccineName(String VaccineName) {
        this.VaccineName = VaccineName;
    }

    public Order(String message, UserAccount sender, UserAccount receiver, String status) {
        super(message, sender, receiver, status);
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    /*public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }*/
    

    /*public VaccineManufacturerOrganization getVaccineManufacturer() {
        return vaccineManufacturer;
    }

    public void setVaccineManufacturer(VaccineManufacturerOrganization vaccineManufacturer) {
        this.vaccineManufacturer = vaccineManufacturer;
    }*/
    
    
}
