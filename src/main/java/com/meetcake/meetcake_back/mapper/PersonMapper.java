package com.meetcake.meetcake_back.mapper;

import com.meetcake.meetcake_back.entity.Person;
import com.meetcake.meetcake_back.model.PersonResponse;
import org.springframework.stereotype.Component;

@Component
public class PersonMapper {
    public PersonResponse toPersonResponse(Person person){
        return new PersonResponse()
                .setName(person.getName())
                .setAge(person.getAge());
    }
    public Person toPerson(PersonResponse personResponse) {
        // Здесь мы не используем id, так как это новый объект
        return new Person()
                .setName(personResponse.getName())
                .setAge(personResponse.getAge());
    }
}
