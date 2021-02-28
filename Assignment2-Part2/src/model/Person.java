/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author snehaswaroop
 */
public class Person extends Community {
    
     String personName;
     double age;
     String SSN;
    
    public Person(String communityName, String personAddress, String personName, double age, String SSN) {
        super(communityName);
        this.personName=personName;
        this.age=age;
        this.SSN=SSN;
    }
    
    
    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }
    

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public String getSSN() {
        return SSN;
    }

    public void setSSN(String SSN) {
        this.SSN = SSN;
    }
    
    
   
}
    
    
    
    
    
    

