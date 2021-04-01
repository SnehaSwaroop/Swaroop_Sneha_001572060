/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Customer.Customer;
import Business.EcoSystem;

import Business.Organization;
import Business.UserAccount.UserAccount;
import userinterface.CustomerRole.CustomerAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author raunak
 */
public class CustomerRole extends Role{

    
   
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount useraccount, EcoSystem business) {
        Customer customer = business.getCustomerDirectory().getCustomerByUserAccount(useraccount);
        return new CustomerAreaJPanel(userProcessContainer, useraccount, business, customer);
    }
    
    
}

