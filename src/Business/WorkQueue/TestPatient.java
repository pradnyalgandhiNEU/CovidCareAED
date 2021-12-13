/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.WorkQueue;

import Business.UserAccount.UserAccount;

/**
 *
 * @author pradnyalgandhi
 */
public class TestPatient extends WorkRequest {
    
    private int patientID;
    private String patientName;

   
    public int getPatientID() {
        return patientID;
    }

    public void setPatientID(int patientID) {
        this.patientID = patientID;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }
    
    public TestPatient(String message, UserAccount sender, UserAccount receiver, String status) {
        super(message, sender, receiver, status);
        
    }

    
    
    
}
