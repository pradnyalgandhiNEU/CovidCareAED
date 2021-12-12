/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Patient.Patient;
import Business.UserAccount.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author ayushgupta
 */
public class VaccinatePatient extends WorkRequest{
    ArrayList <Patient> nonVaccPatientList=new ArrayList<>();
    //private String VaccineName;
    private UserAccount Staff=null;


    public ArrayList<Patient> getNonVaccPatientList() {
        return nonVaccPatientList;
    }

    /*public String getVaccineName() {
    return VaccineName;
    }
    public void setVaccineName(String VaccineName) {
    this.VaccineName = VaccineName;
    }*/
    public void setNonVaccPatientList(ArrayList<Patient> nonVaccPatientList) {
        this.nonVaccPatientList = nonVaccPatientList;
    }

    public UserAccount getStaff() {
        return Staff;
    }

    public void setStaff(UserAccount Staff) {
        this.Staff = Staff;
    }
    public VaccinatePatient(String message, UserAccount sender, UserAccount receiver, String status) {
        super(message, sender, receiver, status);
    }
}
