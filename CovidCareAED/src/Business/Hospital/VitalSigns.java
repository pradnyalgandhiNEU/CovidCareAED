/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Hospital;

import Business.TestingCenter.TestReport;
import java.time.LocalDateTime;


/**
 *
 * @author ayushgupta
 */
public class VitalSigns {
    private double temperature;
    private double bloodPressure;
    private int pulse;
    TestReport report;
    

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public double getBloodPressure() {
        return bloodPressure;
    }

    public void setBloodPressure(double bloodPressure) {
        this.bloodPressure = bloodPressure;
    }

    public int getPulse() {
        return pulse;
    }

    public void setPulse(int pulse) {
        this.pulse = pulse;
    }
    @Override
    public String toString(){
        return String.valueOf(bloodPressure);
    }
}
