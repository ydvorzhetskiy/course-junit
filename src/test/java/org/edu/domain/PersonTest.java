package org.edu.domain;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Класс Person")
class PersonTest {

    @Disabled
    @Test
    @DisplayName("корректно создаётся")
    void initAngGet() {
        Person person = new Person(42, "Ivan");
        assertEquals("Ivan", person.getName());

        assertThat(person)
                .hasFieldOrPropertyWithValue("age", 42);
    }
}
