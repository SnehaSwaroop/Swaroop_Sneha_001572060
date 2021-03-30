/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Restaurant;

import Business.DeliveryMan.DeliveryMan;
import Business.Restaurant.RestaurantDirectory;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.WorkQueue;
import java.util.ArrayList;

/**
 *
 * @author harold
 */
public class Restaurant {
    
    private String name;
    private UserAccount admin;
    private String restaurantId;
    private ArrayList<Menu> menu;
    private WorkQueue workQueue;
    private ArrayList<DeliveryMan> deliveryManList;

    public Restaurant() {
       
        this.deliveryManList = new ArrayList<DeliveryMan>();
        this.menu = new ArrayList<Menu>();
        this.workQueue = new WorkQueue();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UserAccount getAdmin() {
        return admin;
    }

    public void setAdmin(UserAccount admin) {
        this.admin = admin;
    }

    public String getRestaurantId() {
        return restaurantId;
    }

    public void setRestaurantId(String restaurantId) {
        this.restaurantId = restaurantId;
    }

    public ArrayList<Menu> getMenu() {
        return menu;
    }

    public void setMenu(ArrayList<Menu> menu) {
        this.menu = menu;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    public ArrayList<DeliveryMan> getDeliveryManList() {
        return deliveryManList;
    }

    public void setDeliveryManList(ArrayList<DeliveryMan> deliveryManList) {
        this.deliveryManList = deliveryManList;
    }

    
}
