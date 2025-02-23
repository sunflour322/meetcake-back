package com.meetcake.meetcake_back.service;

import com.meetcake.meetcake_back.model.PersonResponse;

public interface PersonService {
    PersonResponse getPerson(Integer id);
}
