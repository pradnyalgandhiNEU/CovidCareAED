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
    }

    public ArrayList<Person> getPersonList() {
        return personList;
    }

    public void setPersonList(ArrayList<Person> personList) {
        this.personList = personList;
    }
      

    public Person newPerson(int personID, String name, String street, String zipcode, int age, String Community, String phoneNo, String email, String username, String password) {

        Person person = new Person(personID, name, street, zipcode, age, Community, phoneNo, email, username, password );
        personList.add(person);
        return person;
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
    
}
