/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.VaccineManufacturer;

import Business.Enterprise.VaccinationManufacturer;

/**
 *
 * @author ayushgupta
 */
public class Inventory {
    private int stock;
    VaccinationManufacturer vaccinationManufacturer;

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}
