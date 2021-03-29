/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Restaurant;

import Business.Restaurant.RestaurantDirectory;

/**
 *
 * @author harold
 */
public class Restaurant {
    
    private String name;
    private RestaurantDirectory restaurantDirectory;

    public Restaurant(String name) {
        this.name = name;
        this.restaurantDirectory = restaurantDirectory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public RestaurantDirectory getRestaurantDirectory() {
        return restaurantDirectory;
    }

    public void setRestaurantDirectory(RestaurantDirectory restaurantDirectory) {
        this.restaurantDirectory = restaurantDirectory;
    }

    
}
