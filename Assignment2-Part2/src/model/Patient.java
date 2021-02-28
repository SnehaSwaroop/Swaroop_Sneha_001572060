/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author snehaswaroop
 */
public class Patient extends Person {
    
    private String patientID;
    private VitalSign vitals;
    
    public Patient(String communityName, String personAddress, String personName, double age, String SSN, String patientID, VitalSign vitals) {
        super(communityName, personAddress, personName, age, SSN);
        this.patientID=patientID;
        this.vitals=vitals;
    }
    
    
    @Override
    public String toString() {
        return "Patient Data: " + "\tPatient ID= " + patientID + ",\tName= " + personName + ",\tAge= " + age + ",\tSSN= " + SSN + ",\tRespiratory Rate= " + vitals.getRespiratoryRate() + ",\t Heart Rate= " + vitals.getHeartRate() + ",\tBlood Pressure= " + vitals.getBloodPressure() + ",\tWeight= " + vitals.getWeight() + '}';
    } 
    

    public String getPatientID() {
        return patientID;
    }

    public void setPatientID(String patientID) {
        this.patientID = patientID;
    }

    public VitalSign getVitals() {
        return vitals;
    }

    public void setVitals(VitalSign vitals) {
        this.vitals = vitals;
    }
    
    
 public boolean isPatientNormal() {
        
        if (this.age>0 && this.age<=0.1)
        {
            if (vitals.getRespiratoryRate() >=30 && vitals.getRespiratoryRate() <=50 && vitals.getHeartRate() >= 120 && vitals.getHeartRate()<=160 && vitals.getBloodPressure() >=50 && vitals.getBloodPressure()<=70 && vitals.getWeight()>=2 && vitals.getWeight()<=3 )
            {
                return true;
            }
            else
            {
                return false;
            }
        }
        else if (this.age >0.1 && this.age <1)
        {
            if (vitals.getRespiratoryRate() >=20 && vitals.getRespiratoryRate() <=30 && vitals.getHeartRate() >= 80 && vitals.getHeartRate()<=140 && vitals.getBloodPressure() >=70 && vitals.getBloodPressure()<=100 && vitals.getWeight()>=4 && vitals.getWeight()<=10)
            {
                return true;
            }
            else
            {
                return false;
            }
        }
        else if (age>=1 && age<=3)
        {
            if (vitals.getRespiratoryRate() >= 20 && vitals.getRespiratoryRate()<=30 &&  vitals.getHeartRate() >=80 && vitals.getHeartRate()<=130 && vitals.getBloodPressure() >=80 && vitals.getBloodPressure()<=100 && vitals.getWeight()>=10 && vitals.getWeight()<=14)
            {
                return true;
            }
            else
            {
                return false;
            }
        }
        else if (age>=3 && age<=5)
        {
            if (vitals.getRespiratoryRate()>= 20 && vitals.getRespiratoryRate()<= 30  && vitals.getHeartRate() >=80 && vitals.getHeartRate()<=120 && vitals.getBloodPressure() >=80 && vitals.getBloodPressure()<=110 && vitals.getWeight()>=14 && vitals.getWeight()<=18)
            {
                return true;
            }
            else
            {
                return false;
            }
        }
        else if (age>=6 && age <=12)
        {
           if (vitals.getRespiratoryRate()>=20 && vitals.getRespiratoryRate() <=30 && vitals.getHeartRate() >=70 && vitals.getHeartRate()<=110 && vitals.getBloodPressure() >=80 && vitals.getBloodPressure()<=120 && vitals.getWeight()>=20 && vitals.getWeight()<=42 )
           {
               return true;
           }
           else
           {
               return false;
           }
        }
        else if (age>=13)
        {
            if (vitals.getRespiratoryRate()>=12 && vitals.getRespiratoryRate() <=20 && vitals.getHeartRate() >=55 && vitals.getHeartRate()<=105 && vitals.getBloodPressure() >=110 && vitals.getBloodPressure()<=120 && vitals.getWeight()>=50)
            {
                return true;
            }
            else
            {
                return false;
            }
                
            
      
        }
        return false;
        
        
    }
    
    
 
 public boolean isBPNormal() {
    if (this.age>0 && this.age<=0.1)
        {
            if (vitals.getBloodPressure() >=50 && vitals.getBloodPressure()<=70)
            {
                return true;
            }
            else
            {
                return false;
            }
        }
        else if (this.age >0.1 && this.age <1)
        {
            if ( vitals.getBloodPressure() >=70 && vitals.getBloodPressure()<=100 )
            {
                return true;
            }
            else
            {
                return false;
            }
        }
        else if (age>=1 && age<=3)
        {
            if (vitals.getBloodPressure() >=80 && vitals.getBloodPressure()<=100 )
            {
                return true;
            }
            else
            {
                return false;
            }
        }
        else if (age>=3 && age<=5)
        {
            if ( vitals.getBloodPressure() >=80 && vitals.getBloodPressure()<=110 )
            {
                return true;
            }
            else
            {
                return false;
            }
        }
        else if (age>=6 && age <=12)
        {
           if ( vitals.getBloodPressure() >=80 && vitals.getBloodPressure()<=120 )
           {
               return true;
           }
           else
           {
               return false;
           }
        }
        else if (age>=13)
        {
            if ( vitals.getBloodPressure() >=110 && vitals.getBloodPressure()<=120 )
            {
                return true;
            }
            else
            {
                return false;
            }
                
            
      
        }
        return false;
        
        
    }
 
}
