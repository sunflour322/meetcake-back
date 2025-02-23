package com.meetcake.meetcake_back.service.impl;

import com.meetcake.meetcake_back.entity.Person;
import com.meetcake.meetcake_back.mapper.PersonMapper;
import com.meetcake.meetcake_back.model.PersonResponse;
import com.meetcake.meetcake_back.repository.PersonRepository;
import com.meetcake.meetcake_back.service.PersonService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PersonServiceImpl implements PersonService {

    private final PersonRepository personRepository;
    private final PersonMapper personMapper;
    @Override
    public PersonResponse getPerson(Integer id) {
        Person person   = personRepository.findById(id).orElseThrow(RuntimeException::new);
        return personMapper.toPersonResponse(person);
    }
}
