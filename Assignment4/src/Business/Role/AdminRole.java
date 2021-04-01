/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;

import Business.Organization;
import Business.Restaurant.Restaurant;
import Business.UserAccount.UserAccount;
import userinterface.RestaurantAdminRole.AdminWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author raunak
 */
public class AdminRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount useraccount, EcoSystem business) {
        //Find the restaurant for the Admin association and add it to the work area
        Restaurant restaurant = business.getRestaurantDirectory().getRestaurantByAdmin(useraccount);
        
        return new AdminWorkAreaJPanel(userProcessContainer, restaurant);
    }

    
    
}
