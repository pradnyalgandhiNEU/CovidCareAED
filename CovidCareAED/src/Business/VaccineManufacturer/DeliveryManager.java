/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.VaccineManufacturer;

import Business.Enterprise.VaccinationManufacturer;
import Business.Person.Person;

/**
 *
 * @author ayushgupta
 */
public class DeliveryManager extends Person{
    private int DeliveryManagerId;
    VaccinationManufacturer vaccineManufacturer;

    public int getDeliveryManagerId() {
        return DeliveryManagerId;
    }

    public void setDeliveryManagerId(int DeliveryManagerId) {
        this.DeliveryManagerId = DeliveryManagerId;
    }

    public VaccinationManufacturer getVaccineManufacturer() {
        return vaccineManufacturer;
    }

    public void setVaccineManufacturer(VaccinationManufacturer vaccineManufacturer) {
        this.vaccineManufacturer = vaccineManufacturer;
    }
    
}
