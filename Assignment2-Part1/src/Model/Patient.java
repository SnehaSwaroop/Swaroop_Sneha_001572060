/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author snehaswaroop
 */
public class Patient {
    
    private String name;
    private double age;
    private VitalSigns vitals;  
    ArrayList<VitalSigns> history;
    
    public Patient(String name, double age, VitalSigns v){
    
        this.name = name;
        this.age = age;
        this.vitals = v;
 
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    
    
    @Override
    public String toString() {
        return "Patient's Data: " + "ID: " + vitals.getPatientID() +  "\tName: " + name + ", \tAge: " + age + ", \tRespiratory Rate: " + vitals.getRespiratoryRate() + ", \tHeart Rate: " + vitals.getHeartRate() + ", \tBlood Pressure: " + vitals.getBloodPressure() + ", \tWeight in Kgs: " + vitals.getWeightinkgs() + ", \tWeight in Pounds: "+ vitals.getWeightinlbs() + '}';
    }
    
    
    
    
    
    
    public boolean isPatientNormal() {
        
        if (this.age>0 && this.age<=0.1)
        {
            if (vitals.getRespiratoryRate() >=30 && vitals.getRespiratoryRate() <=50 && vitals.getHeartRate() >= 120 && vitals.getHeartRate()<=160 && vitals.getBloodPressure() >=50 && vitals.getBloodPressure()<=70 && vitals.getWeightinkgs()>=2 && vitals.getWeightinkgs()<=3 && vitals.getWeightinlbs() >=4.5 && vitals.getWeightinlbs()<= 7)
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
            if (vitals.getRespiratoryRate() >=20 && vitals.getRespiratoryRate() <=30 && vitals.getHeartRate() >= 80 && vitals.getHeartRate()<=140 && vitals.getBloodPressure() >=70 && vitals.getBloodPressure()<=100 && vitals.getWeightinkgs()>=4 && vitals.getWeightinkgs()<=10 && vitals.getWeightinlbs() >=9 && vitals.getWeightinlbs()<= 22)
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
            if (vitals.getRespiratoryRate() >= 20 && vitals.getRespiratoryRate()<=30 &&  vitals.getHeartRate() >=80 && vitals.getHeartRate()<=130 && vitals.getBloodPressure() >=80 && vitals.getBloodPressure()<=100 && vitals.getWeightinkgs()>=10 && vitals.getWeightinkgs()<=14 && vitals.getWeightinlbs() >=22 && vitals.getWeightinlbs()<= 31)
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
            if (vitals.getRespiratoryRate()>= 20 && vitals.getRespiratoryRate()<= 30  && vitals.getHeartRate() >=80 && vitals.getHeartRate()<=120 && vitals.getBloodPressure() >=80 && vitals.getBloodPressure()<=110 && vitals.getWeightinkgs()>=14 && vitals.getWeightinkgs()<=18 && vitals.getWeightinlbs() >=31 && vitals.getWeightinlbs()<= 40)
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
           if (vitals.getRespiratoryRate()>=20 && vitals.getRespiratoryRate() <=30 && vitals.getHeartRate() >=70 && vitals.getHeartRate()<=110 && vitals.getBloodPressure() >=80 && vitals.getBloodPressure()<=120 && vitals.getWeightinkgs()>=20 && vitals.getWeightinkgs()<=42 && vitals.getWeightinlbs() >=41 && vitals.getWeightinlbs()<=92)
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
            if (vitals.getRespiratoryRate()>=12 && vitals.getRespiratoryRate() <=20 && vitals.getHeartRate() >=55 && vitals.getHeartRate()<=105 && vitals.getBloodPressure() >=110 && vitals.getBloodPressure()<=120 && vitals.getWeightinkgs()>=50 && vitals.getWeightinlbs() >= 110)
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
    
    
    
    
    
    
    
    public VitalSigns newVitalSign(int patientID, double respiratoryRate, double heartRate, double bloodPressure, double weightinkgs, double weightinlbs){
     
        VitalSigns v = new VitalSigns(patientID, respiratoryRate, heartRate, bloodPressure, weightinkgs, weightinlbs);
        
        if(history == null ) { 
            history = new ArrayList<VitalSigns>();
            
        }
        
        history.add(this.vitals);
        this.vitals = v;
        //System.out.println("Patient history added: " + history.toString());
        
        for(VitalSigns his : history)
        System.out.println("Patient's ID: " +his.getPatientID() + "\tRespiratory Rate: " + his.getRespiratoryRate() + "\tHeart Rate: " + his.getHeartRate() + "\tBlood Pressure: " + his.getBloodPressure() + "\tWeight in KGs:" + his.getWeightinkgs() + "\tWeight in Pounds:" + his.getWeightinlbs());
        
        
        return v;
        

    }
    
  
}
    


  