/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;

import Business.Customer.Customer;
import java.util.ArrayList;

/**
 *
 * @author harold
 */
public class CustomerDirectory {
    
    private ArrayList<Customer> CustomerList;

    public ArrayList<Customer> getCustomerList() {
        return CustomerList;
    }

    public void setCustomerList(ArrayList<Customer> CustomerList) {
        this.CustomerList = CustomerList;
    }
    
    public CustomerDirectory(){
        CustomerList=new ArrayList<Customer>();
    }
    
    public Customer newCustomer(String name) {

        Customer customer = new Customer(name);
        customer.setName(name);
        CustomerList.add(customer);
        return customer;
    }
    
}
