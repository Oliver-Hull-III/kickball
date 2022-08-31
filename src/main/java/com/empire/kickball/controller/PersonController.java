package com.empire.kickball.controller;

import com.empire.kickball.domain.Person;
import com.empire.kickball.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/persons")
public class PersonController {

    @Autowired
    PersonRepository personRepository;

    @PostMapping
    public void createPerson(@RequestBody Person person) {
        personRepository.save(person);
    }


}
