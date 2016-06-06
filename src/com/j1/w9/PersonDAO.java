package com.j1.w9;

import java.util.List;

public interface PersonDAO {
   public List<Person> getAllPersons();
   public Person getPerson(int rollNo);
   public void updatePerson(Person person);
   public void deletePerson(Person person);
}