package com.codedifferently.phonebook.people.repos;

import com.codedifferently.phonebook.people.models.Person;
import com.codedifferently.phonebook.widgets.models.Widget;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface PersonRepo extends JpaRepository<Person, Long> {

    //What's an optional?
    Optional<Person> findPersonByName(String name);
}
