/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.VaccineManufacturer;

import java.util.ArrayList;

/**
 *
 * @author ayushgupta
 */
public class DeliveryManagerDirectory {
    ArrayList<DeliveryManager> DeliveryManagerList;
    
    public DeliveryManagerDirectory(){
        DeliveryManagerList = new ArrayList<DeliveryManager>();
    }

    public ArrayList<DeliveryManager> getDeliveryManagerList() {
        return DeliveryManagerList;
    }

    public void setDeliveryManagerList(ArrayList<DeliveryManager> DeliveryManagerList) {
        this.DeliveryManagerList = DeliveryManagerList;
    }    
}
