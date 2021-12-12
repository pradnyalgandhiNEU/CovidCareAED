/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Patient;

import Business.Person.Person;
import Business.WorkQueue.AdmitPatient;
import static Business.WorkQueue.Order.gen;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author shreya.ghate
 */
public class Patient extends Person {
    int PatientID;
    private String VaccinationStatus;
    private String QuarantineStatus;
    private String DoctorName;
    Person person;
//    private static int count = 1;

//    public void addPatient(String DoctorName, String PatientName, String AdmissionStatus, int PatientID) {
//        AdmitPatient admitPatient=new AdmitPatient();
//        admitPatient.setPatientID(String.valueOf(id));
//        admitPatient.setDoctorName(DoctorName);
//        admitPatient.setPatientName(person.name);
//        admitPatient.setAdmissionStatus("Admitted");
//        patientList.add(admitPatient);
//        id++;
//    }
    
    public Patient(int personID, String name, String street, String zipcode, int age, String Community, String phoneNo, String email, String DoctorName, String QuarantineStatus, String VaccinationStatus) {
        super(personID, name, street, zipcode, age, Community, phoneNo, email);
        this.DoctorName=DoctorName;
        this.VaccinationStatus=VaccinationStatus;
        this.QuarantineStatus=QuarantineStatus;
        this.PatientID = gen();

    }

     public static int gen() {
        Random r = new Random( System.currentTimeMillis() );
        return ((1 + r.nextInt(2)) * 10000 + r.nextInt(10000));
    }
     
    public int getPatientID() {
        return PatientID;
    }

    public void setPatientID(int PatientID) {
        this.PatientID = PatientID;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public String getVaccinationStatus() {
        return VaccinationStatus;
    }

    public void setVaccinationStatus(String VaccinationStatus) {
        this.VaccinationStatus = VaccinationStatus;
    }

    public String getQuarantineStatus() {
        return QuarantineStatus;
    }

    public void setQuarantineStatus(String QuarantineStatus) {
        this.QuarantineStatus = QuarantineStatus;
    }

    public String getDoctorName() {
        return DoctorName;
    }

    public void setDoctorName(String DoctorName) {
        this.DoctorName = DoctorName;
    }

    public int getPersonID() {
        return personID;
    }

    public void setPersonID(int personID) {
        this.personID = personID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCommunity() {
        return Community;
    }

    public void setCommunity(String Community) {
        this.Community = Community;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
@Override
        public String toString(){
            return name;
        }
}
