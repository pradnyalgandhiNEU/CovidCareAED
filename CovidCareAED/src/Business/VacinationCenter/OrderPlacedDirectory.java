/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.VacinationCenter;

import java.util.ArrayList;

/**
 *
 * @author ayushgupta
 */
public class OrderPlacedDirectory {
    ArrayList<OrderPlaced> orderList;
    
    public OrderPlacedDirectory(){
        orderList = new ArrayList<OrderPlaced>();
    }

    public ArrayList<OrderPlaced> getOrderList() {
        return orderList;
    }

    public void setOrderList(ArrayList<OrderPlaced> orderList) {
        this.orderList = orderList;
    }
    
}
