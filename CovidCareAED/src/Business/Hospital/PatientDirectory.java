/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Hospital;

import Business.Enterprise.Hospital;
import java.util.ArrayList;

/**
 *
 * @author ayushgupta
 */
public class PatientDirectory {
    ArrayList<Patient> patientlist ;
    Hospital hospital;

    public Hospital getHospital() {
        return hospital;
    }

    public void setHospital(Hospital hospital) {
        this.hospital = hospital;
    }
     
      public PatientDirectory (){
          
       patientlist = new ArrayList();

    }

    public ArrayList<Patient> getPatientlist() {
        return patientlist;
    }

    public void setPatientlist(ArrayList<Patient> patientlist) {
        this.patientlist = patientlist;
    }
      

    public Patient newPatient() {

        Patient patient = new Patient();
        patientlist.add(patient);
        return patient;
    }

    public Patient findPatient(int id) {

        for (Patient p : patientlist) {

            if (p.isMatch(id)) {
                return p;
            }
        }
            return null; //not found after going through the whole list
         }

    public void deletePatient(Patient patient) {
        patientlist.remove(patient); //To change body of generated methods, choose Tools | Templates.
    }
}
