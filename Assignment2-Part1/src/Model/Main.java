/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author snehaswaroop
 */
public class Main {
    
    public static void main (String[] args) {
        
    Scanner obj = new Scanner(System.in);
    
    ArrayList<Patient> patientData = new ArrayList<Patient>();
    ArrayList<Patient> history = new ArrayList<Patient>();
    
    char input = 'Y';
    String name;  
    int patientID;
    double age, respiratoryRate, heartRate, bloodPressure, weightinkgs, weightinlbs;
    Patient patient;
    VitalSigns vitals;
    
    while (input == 'Y')
        {
                System.out.print("Enter Patient's ID: ");
                patientID = obj.nextInt();
                
                System.out.print("Enter Patient's Name: ");
                name = obj.next();
                
                System.out.print("Enter Patient's Age: (if newborn, please enter baby's age as 0.2, if in case baby is 2 months old)");
                age = obj.nextDouble();
                
                System.out.print("Enter Patient's Respiratory Rate: ");
                respiratoryRate = obj.nextDouble();
                
                System.out.print("Enter Patient's Heart Rate: ");
                heartRate = obj.nextDouble();
                
                System.out.print("Enter Patient's Blood Pressure: ");
                bloodPressure = obj.nextDouble();
                
                System.out.print("Enter Patient's Weight in Kgs: ");
                weightinkgs = obj.nextDouble();
                
                System.out.print("Enter Patient's Weight in Pounds: ");
                weightinlbs = obj.nextDouble();
                
                
                int i = 0;
                while(!patientData.isEmpty() && i < patientData.size()){
                    if(name.equalsIgnoreCase(patientData.get(i).getName())){
                        vitals = patientData.get(i).newVitalSign(patientID, respiratoryRate, heartRate, bloodPressure, weightinkgs, weightinlbs);
                        /*patientData.add(i, patientData.get(i));*/
                        break;
                    }
                    i++;
                }
                    
                vitals = new VitalSigns(patientID, respiratoryRate, heartRate,bloodPressure, weightinkgs, weightinlbs);
                patient = new Patient(name,age,vitals);
                
                if(i == patientData.size()){
                patientData.add(patient);
                }
                
                if (patient.isPatientNormal() == true)
                {
                   System.out.println("Patient is Normal");
                }
                else
                {
                   System.out.println("Patient is Abnormal");
                }
                
                System.out.print("Do you want to enter another patient's record? (Y/N)");
                String word = obj.next();
                word = word.toUpperCase();
                input= word.charAt(0);
        }
                
    
    
                for(Patient data : patientData)
                System.out.println(data);
                
                for (int i = 0; i < history.size();i++) 
                { 		      
	          System.out.println(history.get(i)); 		
                } 
                    
                    
        
    
        
        
        
    }

}
    
  














