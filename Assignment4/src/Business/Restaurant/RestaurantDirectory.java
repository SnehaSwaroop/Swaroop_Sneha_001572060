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
    
    public Restaurant getRestaurantByAdmin(UserAccount user) {
        Restaurant restaurant = null;
        for (Restaurant r : restaurantList) {
            if(r.getAdmin().equals(user))
                restaurant = r;
        }
        return restaurant;
    }
    
    public Restaurant getRestaurantByDeliveryMan(UserAccount user) {
        Restaurant restaurant = null;
        for (Restaurant r : restaurantList) {
            for(DeliveryMan man: r.getDeliveryManList()) {
               if(man.getUserAccount().equals(user))
                restaurant = r; 
            }  
        }
        return restaurant;
    }
}
