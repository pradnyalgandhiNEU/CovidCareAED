/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Person;

import Business.City.StreetNo;

/**
 *
 * @author ayushgupta
 */
public class Person {
    private String personName;
    private int personId;
    private String emailId;
    private long contactNo;
    private int age;
    StreetNo street;

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public long getContactNo() {
        return contactNo;
    }

    public void setContactNo(long contactNo) {
        this.contactNo = contactNo;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public StreetNo getStreet() {
        return street;
    }

    public void setStreet(StreetNo street) {
        this.street = street;
    }
    public boolean isMatch(int id){
        if(getPersonId()==id) return true;
        return false;
    }
}
