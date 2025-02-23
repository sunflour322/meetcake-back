package com.meetcake.meetcake_back.controller;

import com.meetcake.meetcake_back.entity.Person;
import com.meetcake.meetcake_back.model.PersonResponse;
import com.meetcake.meetcake_back.service.PersonService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("person")
@RequiredArgsConstructor
public class PersonController {

    private final PersonService personService;

    @GetMapping("{id}")
    public PersonResponse getPerson(@PathVariable Integer id){
        return personService.getPerson(id);
    }
    @PostMapping("add")
    public void addPerson(@RequestBody PersonResponse personResponse){
        personService.addPerson(personResponse);
    }
}
