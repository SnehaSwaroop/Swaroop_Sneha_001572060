/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;


/**
 *
 * @author snehaswaroop
 */
public class Main {
    
    public static void main (String[] args) {
        Community community1 = new Community("IreneWoods");
        Community community2 = new Community("ParkAvenue");
        
        City city = new City(community1, community2);
        
        ArrayList<Person> personList = new ArrayList<Person>();
        ArrayList<Patient> patientList = new ArrayList<Patient>();
        
        Person person1 = new Person(community1.getCommunityname(), "Address 1", "Bob", 35, "2007-4005-9045");
        Person person2 = new Person(community2.getCommunityname(),"Address 2", "Mike", 24, "2007-3112-2000");
        Person person3 = new Person(community2.getCommunityname(), "Address 3","Mark", 75, "1998-3112-9045");
        Person person4 = new Person(community2.getCommunityname(), "Address 4","Smith", 2, "5688-6755-9045");
        Person person5 = new Person(community1.getCommunityname(), "Address 5","Rachel", 29, "2007-5433-9045");
        Person person6 = new Person(community1.getCommunityname(), "Address 6","Adi", 40, "2007-6666-9045");
        Person person7 = new Person(community1.getCommunityname(), "Address 7","Sara", 10, "2007-3112-6646");
        Person person8 = new Person(community2.getCommunityname(), "Address 8","Tom", 66, "2007-4555-4655");
        Person person9 = new Person(community1.getCommunityname(), "Address 9","Peter", 15, "2007-4565-9045");
        Person person10 = new Person(community1.getCommunityname(),"Address 10", "Mathew", 38, "2009-3555-9045");
        Person person11 = new Person(community2.getCommunityname(), "Address 11","Penny", 49, "4355-3112-9045");
        Person person12 = new Person(community1.getCommunityname(), "Address 12","Bill", 56, "3444-3112-9045");
        Person person13 = new Person(community2.getCommunityname(), "Address 13","Karen", 23, "2344-3112-9045");
        Person person14 = new Person(community1.getCommunityname(), "Address 14","Karl", 42, "2007-4545-9045");
        Person person15 = new Person(community1.getCommunityname(), "Address 15","Susan", 80, "4478-3422-9045");
        
        personList.add(person1);
        personList.add(person2);
        personList.add(person3);
        personList.add(person4);
        personList.add(person5);
        personList.add(person6);
        personList.add(person7);
        personList.add(person8);
        personList.add(person9);
        personList.add(person10);
        personList.add(person11);
        personList.add(person12);
        personList.add(person13);
        personList.add(person14);
        personList.add(person15);
        
        
        
        Scanner obj = new Scanner(System.in);
        char input = 'Y';
        String communityName, name, address, patientID, ssn;
        
        double age, respiratoryRate, heartRate, bloodPressure, weight;
        Patient patient;
        VitalSign vitals; 
        
        while (input == 'Y')
        {
            
            
                System.out.print("Enter Patient Name ");
                name = obj.next(); 
                
                System.out.print("Enter Patient Community ");
                communityName = obj.next(); 
                
                System.out.println("Enter Patient Address");
                address = obj.next();
            
                System.out.print("Enter Patient Age ");
                age = obj.nextDouble();
                
                System.out.print("Enter Patient SSN ");
                ssn = obj.next();
                
                System.out.print("Enter Patient PatientID ");
                patientID = obj.next();
                
                System.out.print("Enter Patient Respiratory Rate ");
                respiratoryRate = obj.nextDouble();

                System.out.print("Enter Patient Heart Rate ");
                heartRate = obj.nextDouble();

                System.out.print("Enter Patient Blood Pressure ");
                bloodPressure = obj.nextDouble();
                
                System.out.print("Enter Patient Weight ");
                weight = obj.nextDouble();
                
                vitals = new VitalSign(respiratoryRate, heartRate,bloodPressure, weight);
                
                patient = new Patient(communityName, address, name, age, ssn ,patientID, vitals);
                
                boolean patientExist = false;
                
                for(Person p : personList) {
                
                if (p.getPersonName().equalsIgnoreCase(name)) {
                    patientExist = true;
                    patientList.add(patient);
                    patient.isPatientNormal();
                    if (patient.isPatientNormal()) {
                        System.out.println("Patient is Normal");
                    }
                    else {
                        System.out.println("Patient is Abnormal");
                    }
                    break;
                }
                }
                    
                    if (patientExist) {
                        System.out.println("Patient Exist in City");
                    }
                    else {
                        System.out.println("Patient does not exist in City");
                    }
                    
 

                System.out.print("Do you want to enter Another patient Record? (Y/N)");
                String word = obj.next();
                word = word.toUpperCase();
                input= word.charAt(0);
        }
        
        int community1count = 0;
        int community2count = 0;
        for(Patient p : patientList) {
            
            
            if (!p.isBPNormal()) {
                
                if (p.getCommunityname().equalsIgnoreCase(community1.getCommunityname())) {
                    community1count++;
                }
                else if (p.getCommunityname().equalsIgnoreCase(community2.getCommunityname())) {
                    community2count++;
                }
            }
            
            
            for(Patient data : patientList) {
                System.out.println(data);
            }
            
    }
        System.out.println("Community 1 abnormal bp = " + community1count);
        System.out.println("Community 2 abnormal bp = " + community2count);
        
    }
    
}
