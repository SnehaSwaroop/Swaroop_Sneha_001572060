/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author snehaswaroop
 */
public class VitalSigns {
    
    private int patientID;
    private double respiratoryRate;
    private double heartRate;
    private double bloodPressure;
    private double weightinkgs;
    private double weightinlbs;
    
    public VitalSigns(int patientID, double respiratoryRate, double heartRate, double bloodPressure, double weightinkgs, double weightinlbs) {

        this.patientID = patientID;
        this.respiratoryRate = respiratoryRate;
        this.heartRate = heartRate;
        this.bloodPressure = bloodPressure;
        this.weightinkgs = weightinkgs;
        this.weightinlbs = weightinlbs;
        
    }

    public int getPatientID() {
        return patientID;
    }

    public void setPatientID(int patientID) {
        this.patientID = patientID;
    }
  
    public double getRespiratoryRate() {
        return respiratoryRate;
    }

    public void setRespiratoryRate(double respiratoryRate) {
        this.respiratoryRate = respiratoryRate;
    }

    public double getHeartRate() {
        return heartRate;
    }

    public void setHeartRate(double heartRate) {
        this.heartRate = heartRate;
    }

    public double getBloodPressure() {
        return bloodPressure;
    }

    public void setBloodPressure(double bloodPressure) {
        this.bloodPressure = bloodPressure;
    }

    public double getWeightinkgs() {
        return weightinkgs;
    }

    public void setWeightinkgs(double weightinkgs) {
        this.weightinkgs = weightinkgs;
    }    

    public double getWeightinlbs() {
        return weightinlbs;
    }

    public void setWeightinlbs(double weightinlbs) {
        this.weightinlbs = weightinlbs;
    }
    
    
    

    
}
