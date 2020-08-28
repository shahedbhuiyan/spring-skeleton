package com.shahed.javaee.jparepo;


import com.shahed.javaee.entity.Person;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class BaseRepository {

    @PersistenceContext
    private EntityManager entityManager;

    public void save(Person person){
        entityManager.persist(person);
    }

    public Session getSession(){
        return entityManager.unwrap(Session.class);
    }

}
