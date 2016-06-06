package com.j1.w9;
import java.util.ArrayList;
import java.util.List;

public class PersonDAOImpl implements PersonDAO {
	
   //list is working as a database
   List<Person> persons;

   public PersonDAOImpl(){
      persons = new ArrayList<Person>();
      Person person1 = new Person("Robert",0);
      Person person2 = new Person("John",1);
      persons.add(person1);
      persons.add(person2);		
   }

   public void deletePerson(Person person) {
      persons.remove(person.getRollNo());
      System.out.println("Person: Roll No " + person.getRollNo() + ", deleted from database");
   }

   public List<Person> getAllPersons() {
      return persons;
   }

   @Override
   public Person getPerson(int rollNo) {
      return persons.get(rollNo);
   }

   @Override
   public void updatePerson(Person person) {
      persons.get(person.getRollNo()).setName(person.getName());
      System.out.println("Person: Roll No " + person.getRollNo() + ", updated in the database");
   }

}