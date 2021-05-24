package org.edu.domain;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Класс Person")
class PersonTest {

    @DisplayName("корректно создаётся")
    @Test
    void initAngGet() {
        Person person = new Person(42, "Ivan");
        assertEquals("Ivan", person.getName());

        assertThat(person)
                .hasFieldOrPropertyWithValue("age", 42);
    }
    
    @DisplayName("Increment birthdate")
    @Test
    void increment() {
        Person person = new Person(42, "Ivan");
        person.birthDay();
        assertThat(person)
                .hasFieldOrPropertyWithValue("age", 43);
    }
    
}
