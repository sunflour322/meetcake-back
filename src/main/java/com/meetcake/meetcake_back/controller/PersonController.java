package com.meetcake.meetcake_back.controller;

import com.meetcake.meetcake_back.entity.Person;
import com.meetcake.meetcake_back.model.PersonResponse;
import com.meetcake.meetcake_back.service.PersonService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("person2")
@RequiredArgsConstructor
public class PersonController {

    private final PersonService personService;

    @GetMapping("{id}")
    public PersonResponse getPerson(@PathVariable Integer id){
        return personService.getPerson(id);
    }
}
