package com.entitymanager.springboot_crud_entity_manager.repository;

import com.entitymanager.springboot_crud_entity_manager.entity.Person;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Transactional
public class PersonRepository {

    @PersistenceContext
    EntityManager entityManager;

    public void update(Person person) {
        entityManager.merge(person);
    }

    public void insert(Person person) {
        entityManager.merge(person);
    }

    public Person findById(int id) {
        return entityManager.find(Person.class, id);
    }

    public void deleteById(int id) {
        Person person = findById(id);
        entityManager.remove(person);
    }

    public List<Person> findAll() {
        TypedQuery<Person> namedQuery = entityManager.createNamedQuery("find_all", Person.class);
        return namedQuery.getResultList();
    }

}
