/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DeliveryMan;

import java.util.ArrayList;
import Business.DeliveryMan.DeliveryMan;
import Business.Employee.Employee;

/**
 *
 * @author harold
 */
public class DeliveryManDirectory {
    
    private ArrayList<DeliveryMan> DeliveryManList;

    public DeliveryManDirectory() {
        this.DeliveryManList = new ArrayList<DeliveryMan>();
    }
    
    public ArrayList<DeliveryMan> getDeliveryManList() {
        return DeliveryManList;
    }

    public void setDeliveryManList(ArrayList<DeliveryMan> DeliveryManList) {
        this.DeliveryManList = DeliveryManList;
    }
}
