/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DeliveryMan;

import Business.DeliveryMan.DeliveryManDirectory;

/**
 *
 * @author harold
 */
public class DeliveryMan {
    
    private String name;
    private DeliveryManDirectory deliveryManDirectory;

    public DeliveryMan(String name) {
        this.name = name;
        this.deliveryManDirectory = deliveryManDirectory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DeliveryManDirectory getDeliveryManDirectory() {
        return deliveryManDirectory;
    }

    public void setDeliveryManDirectory(DeliveryManDirectory deliveryManDirectory) {
        this.deliveryManDirectory = deliveryManDirectory;
    }
    
    
}
