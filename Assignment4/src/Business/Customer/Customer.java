/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;

import Business.Customer.CustomerDirectory;
import Business.UserAccount.UserAccount;
/**
 *
 * @author harold
 */
public class Customer {
    
    private String name;
    private String phoneNumber;
    private UserAccount userAccountLink;
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public UserAccount getUserAccountLink() {
        return userAccountLink;
    }

    public void setUserAccountLink(UserAccount userAccountLink) {
        this.userAccountLink = userAccountLink;
    }
    
    @Override
    public String toString() {
        return getName();
    }
    
}
