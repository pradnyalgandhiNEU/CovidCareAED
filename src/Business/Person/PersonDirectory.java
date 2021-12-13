/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Person;

import java.util.ArrayList;

/**
 *
 * @author pradnyalgandhi
 */
public class PersonDirectory {
    ArrayList<Person> personList;
    
    public PersonDirectory(){
        personList = new ArrayList<Person>();
        Person p1 =new Person(1,"Ayush Gupta", "Torpie St", "02120", 23, "Mission Main", "9352054045", "aush@gmail.com");
        Person p2 =new Person(2,"Shreya Gupta", "2 Torpie St", "02121", 24, "Mission Main", "9352054945", "ayudfgsh@gmail.com");
        Person p3 =new Person(3,"Pradnyal Gupta", "3 Torpie St", "02130", 25, "Mission Main", "9342054045", "ayvbush@gmail.com");
        Person p4 =new Person(4,"Tanuj Ahuja", "park St", "02120", 23, "Mission Main", "9352054345", "ayuvbsh@gmail.com");
        Person p5 =new Person(5,"Mahima Agarwal", "selum St", "02120", 29, "Mission Main", "9352054045", "ayusvbh@gmail.com");
        Person p6 =new Person(6,"Keith Rebello", "krishna St", "04120", 23, "Mission Main", "9355054045", "ayvbush@gmail.com");
        Person p7 =new Person(7,"Darshan bhaiya", "Torpie St", "02120", 23, "Mission Main", "9322054045", "ayuvbsh@gmail.com");
        Person p8 =new Person(8,"xyz", "Torpie St", "02180", 22, "Mission Main", "9352054145", "ayvbush@gmail.com");

        personList.add(p1);
        personList.add(p2);
        personList.add(p3);
        personList.add(p4);
        personList.add(p5);
        personList.add(p6);
        personList.add(p7);
        personList.add(p8);
    }

    public ArrayList<Person> getPersonList() {
        return personList;
    }

    public void setPersonList(ArrayList<Person> personList) {
        this.personList = personList;
    }
      

    public Person newPerson(int personID, String name, String street, String zipcode, int age, String Community, String phoneNo, String email) {

        Person person = new Person(personID, name, street, zipcode, age, Community, phoneNo, email );
        personList.add(person);
        return person;
    }
    
    public void updatePerson(Person person, String name, String street, String zipcode, int age, String Community, String phoneNo, String email){
        person.setName(name);
        person.setStreet(street);
        person.setZipcode(zipcode);
        person.setAge(age);
        person.setCommunity(Community);
        person.setPhoneNo(phoneNo);
        person.setEmail(email);
    }

    public Person findPerson(int id) {

        for (Person p : personList) {

            if (p.isMatch(id)) {
                return p;
            }
        }
            return null; //not found after going through the whole list
         }
    
    public void deletePerson(Person person){
        personList.remove(person);
    }
    
    public boolean checkIfNameIsUnique(String name){
        for (Person p : personList){
            if (p.getName().equals(name))
                return false;
        }
        return true;
    }
    public boolean checkIfEmailIsUnique(String email){
        for (Person p : personList){
            if (p.getEmail().equals(email))
                return false;
        }
        return true;
    }
    public boolean checkIfIDIsUnique(int ID){
        for (Person p : personList){
            if (p.getPersonID()==ID)
                return false;
        }
        return true;
    }
    
}
