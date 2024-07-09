package com.entitymanager.springboot_crud_entity_manager.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@NamedQuery(name="find_all", query="select p from Person p")
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String email;
    private String location;

    public Person(String name, String email, String location) {
        this.name = name;
        this.email = email;
        this.location = location;

    }

}
