/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Restaurant;


import java.util.ArrayList;
import Business.Restaurant.Restaurant;

/**
 *
 * @author harold
 */
public class RestaurantDirectory {
    
    private ArrayList<Restaurant> RestaurantList;
   

    public ArrayList<Restaurant> getRestaurantList() {
        return RestaurantList;
    }

    public void setRestaurantList(ArrayList<Restaurant> RestaurantList) {
        this.RestaurantList = RestaurantList;
    }

    public RestaurantDirectory(){
        RestaurantList=new ArrayList<Restaurant>();
    }
    
    public Restaurant newRestaurant(String name) {

        Restaurant restaurant = new Restaurant(name);
        restaurant.setName(name);
        RestaurantList.add(restaurant);
        return restaurant;
    }
    
}
