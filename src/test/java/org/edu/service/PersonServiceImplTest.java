package org.edu.service;

import org.edu.dao.PersonDao;
import org.edu.domain.Person;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Java6Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.BDDMockito.given;

@DisplayName("Класс PersonServiceImpl")
@ExtendWith(MockitoExtension.class)
class PersonServiceImplTest {

    @Mock
    private PersonDao personDao;

    private PersonService personService;

    @BeforeEach
    void setUp() {
        personService = new PersonServiceImpl(personDao);
    }

    @DisplayName("должен получать по имени")
    @Test
    void getByName() {
        // TODO: use eq mapper
        given(personDao.getByName(any())).willReturn(new Person(10, "Ivan"));
        assertThat(personService.getByName("Ivan"))
                .isNotNull(); // TODO: compare by equals
    }
}
