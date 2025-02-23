package com.meetcake.meetcake_back.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class PersonResponse {

    private String name;
    private Integer age;
}
