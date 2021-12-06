/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.VaccineManufacturer;

import Business.Enterprise.VaccinationManufacturer;
import java.util.ArrayList;

/**
 *
 * @author ayushgupta
 */
public class OrderReceivedDirectory {
    ArrayList<OrderReceived> orderReceivedList;
    VaccinationManufacturer vaccinationManufacturer;
    
    public OrderReceivedDirectory(){
        orderReceivedList = new ArrayList<OrderReceived>();
    }

    public ArrayList<OrderReceived> getOrderReceivedList() {
        return orderReceivedList;
    }

    public void setOrderReceivedList(ArrayList<OrderReceived> orderReceivedList) {
        this.orderReceivedList = orderReceivedList;
    }
}
