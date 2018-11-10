package org.edu.service;

import org.edu.domain.Person;

import java.util.List;

public interface PersonService {

    Person getByName(String name);

    List<Person> getAll();

    void checkNameExists(String name);

    void save(Person p);
}
