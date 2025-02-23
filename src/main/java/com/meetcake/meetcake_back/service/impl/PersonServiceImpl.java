package com.meetcake.meetcake_back.service.impl;

import com.meetcake.meetcake_back.entity.Person;
import com.meetcake.meetcake_back.mapper.PersonMapper;
import com.meetcake.meetcake_back.model.PersonResponse;
import com.meetcake.meetcake_back.repository.PersonRepository;
import com.meetcake.meetcake_back.service.PersonService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;

@Service
@RequiredArgsConstructor
public class PersonServiceImpl implements PersonService {

    private final PersonRepository personRepository;
    private final PersonMapper personMapper;
    @Override
    public PersonResponse getPerson(Integer id) {
        Person person = personRepository.findById(id).orElseThrow(RuntimeException::new);
        return personMapper.toPersonResponse(person);
    }

//    @Override
//    public void addPerson(@RequestBody PersonResponse personResponse) {
//        personMapper.toPersonResponse(new Person());
//    }
    @Override
    public PersonResponse addPerson(PersonResponse personResponse) {
    // Преобразуем PersonResponse в Person
        Person person = personMapper.toPerson(personResponse);
        // Сохраняем в базу данных
        person = personRepository.save(person);
        // Преобразуем обратно в PersonResponse, чтобы вернуть клиенту
        return personMapper.toPersonResponse(person);
    }
}
