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
        personList = new ArrayList();
    }
    
    public void setPersonlist(ArrayList<Person> personlist) {
        this.personList = personlist;
    }
      

    public Person newPerson() {

        Person person = new Person();
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
