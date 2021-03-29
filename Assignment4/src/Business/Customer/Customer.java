/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;

import Business.Customer.CustomerDirectory;
/**
 *
 * @author harold
 */
public class Customer {
    
    private String name;
    private CustomerDirectory customerDirectory;

    public Customer(String name) {
        this.name = name;
        this.customerDirectory = customerDirectory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CustomerDirectory getCustomerDirectory() {
        return customerDirectory;
    }

    public void setCustomerDirectory(CustomerDirectory customerDirectory) {
        this.customerDirectory = customerDirectory;
    }
    
}
