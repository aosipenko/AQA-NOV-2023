package org.prog.db.tables;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PersonsJpa extends JpaRepository<Persons, Long> {

    @Query(value = "SELECT * FROM Persons ORDER BY RAND() LIMIT 1", nativeQuery = true)
    Optional<Persons> getRandomPerson();

    Optional<Persons> findByFirstName(String name);

    //SELECT * FROM PERSONS WHERE GENDER = '$gender' AND TITLE = '$title'
    Optional<Persons> findAllByGenderAndTitle(String gender, String title);

    Optional<Persons> findByFirstNameAndLastName(String name, String lastName);
}