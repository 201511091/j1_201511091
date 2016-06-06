package com.j1.w9;

public class DaoTestDrive {
	   public static void main(String[] args) {
	      PersonDAO personDao = new PersonDAOImpl();

	      for (Person person : personDao.getAllPersons()) {
	         System.out.println("Person: [RollNo : " + person.getRollNo() + ", Name : " + person.getName() + " ]");
	      }

	      Person person = personDao.getAllPersons().get(0);
	      person.setName("Michael");
	      personDao.updatePerson(person);

	      //get the student
	      personDao.getPerson(0);
	      System.out.println("Person: [RollNo : " + person.getRollNo() + ", Name : " + person.getName() + " ]");		
	   }
}