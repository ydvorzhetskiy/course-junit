package org.edu.service;

import org.edu.dao.PersonDao;
import org.edu.domain.Person;

import java.util.List;

public class PersonServiceImpl implements PersonService {

    private final PersonDao dao;

    public PersonServiceImpl(PersonDao dao) {
        this.dao = dao;
    }

    @Override
    public Person getByName(String name) {
        return dao.getByName(name);
    }

    @Override
    public List<Person> getAll() {
        return null;
    }

    @Override
    public void checkNameExists(String name) {

    }

    @Override
    public void save(Person p) {

    }
}
