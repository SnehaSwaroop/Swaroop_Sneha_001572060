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
public class PatientDirectory extends Person {
    
    private String patientID;

    public PatientDirectory(String communityName, String personName, String personAddress, int age, String SSN) {
        super(communityName, personName, personAddress, age, SSN);
    }
    

    
}
