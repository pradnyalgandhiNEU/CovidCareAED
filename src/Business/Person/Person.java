/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Person;

/**
 *
 * @author pradnyalgandhi
 */
public class Person {
    private int personID;
    private String name;
    private String street;
    private String zipcode;
    private int age;
    private String Community;
    private String phoneNo;
    private String email;
    private String username;
    private String password;
    
    public Person(int personID, String name, String street, String zipcode, int age, String Community, String phoneNo, String email, String username, String password){
        this.personID = personID;
        this.name = name;
        this.street = street;
        this.zipcode = zipcode;
        this.age = age;
        this.Community = Community;
        this.phoneNo = phoneNo;
        this.email = email;
        this.username = username;
        this.password = password;
        
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

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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
    
    public boolean isMatch(int id){
        if(getPersonID()==id) return true;
        return false;
    }
    
}
