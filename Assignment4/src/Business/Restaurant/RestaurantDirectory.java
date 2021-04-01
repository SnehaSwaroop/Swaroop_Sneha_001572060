/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Restaurant;


import Business.DeliveryMan.DeliveryMan;
import java.util.ArrayList;
import Business.Restaurant.Restaurant;
import Business.UserAccount.UserAccount;

/**
 *
 * @author harold
 */
public class RestaurantDirectory {
    
    private ArrayList<Restaurant> restaurantList;

    public ArrayList<Restaurant> getRestaurantList() {
        return restaurantList;
    }

    public void setRestaurantList(ArrayList<Restaurant> RestaurantList) {
        this.restaurantList = RestaurantList;
    }

    public RestaurantDirectory(){
        restaurantList=new ArrayList<Restaurant>();
    }
    
    public Restaurant getRestaurantBasedOnAdminName(UserAccount ua) {
        Restaurant restaurant = null;
        for (Restaurant r : restaurantList) {
            if(r.getAdmin().equals(ua))
                restaurant = r;
        }
        return restaurant;
    }
    
    public Restaurant getRestaurantBasedonDelManName(UserAccount ua) {
        Restaurant restaurant = null;
        for (Restaurant r : restaurantList) {
            for(DeliveryMan dm: r.getDeliveryManList()) {
               if(dm.getUserAccount().equals(ua))
                restaurant = r; 
            }  
        }
        return restaurant;
    }
    
    
}
