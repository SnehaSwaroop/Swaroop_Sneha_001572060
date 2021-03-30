/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DeliveryMan;

import Business.DeliveryMan.DeliveryManDirectory;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.WorkRequest;

/**
 *
 * @author harold
 */
public class DeliveryMan {
    
    private String name;
    private String phoneNumber;
    private WorkRequest workRequest;
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

    public WorkRequest getWorkRequest() {
        return workRequest;
    }

    public void setWorkRequest(WorkRequest workRequest) {
        this.workRequest = workRequest;
    }

    public UserAccount getUserAccountLink() {
        return userAccountLink;
    }

    public void setUserAccountLink(UserAccount userAccountLink) {
        this.userAccountLink = userAccountLink;
    }

    
}
