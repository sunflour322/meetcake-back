package com.meetcake.meetcake_back.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Entity
@Table(schema = "public", name = "person")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Accessors(chain = true)
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "name")
    private String name;
    private Integer age;
}
