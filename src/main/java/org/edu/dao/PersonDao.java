package org.edu.dao;

import org.edu.domain.Person;

import java.util.List;

public interface PersonDao {
    Person getByName(String name) throws PersonNoFoundException;

    List<Person> getAll();

    void deleteByName() throws PersonNoFoundException;

    void save(Person person);
}
