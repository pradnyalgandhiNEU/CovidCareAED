/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Hospital;

import Business.Person.Person;
import java.util.ArrayList;

/**
 *
 * @author ayushgupta
 */
public class DoctorDirectory {
    ArrayList<Doctor> doctorList;
    
    public DoctorDirectory (){
          
       doctorList = new ArrayList();

    }

    public ArrayList<Doctor> getDoctorList() {
        return doctorList;
    }

    public void setDoctorList(ArrayList<Doctor> doctorList) {
        this.doctorList = doctorList;
    }

    
    public Doctor newDoctor() {

        Doctor doctor = new Doctor();
        doctorList.add(doctor);
        return doctor;
    }

    public Doctor findDoctor(int id) {

        for (Doctor d : doctorList) {

            if (d.isMatch(id)) {
                return d;
            }
        }
            return null; //not found after going through the whole list
         }
    
    public void deleteDoctor(Person person){
        doctorList.remove(person);
    }
}
