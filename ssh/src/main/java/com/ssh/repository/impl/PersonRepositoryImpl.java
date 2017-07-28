package com.ssh.repository.impl;

import com.ssh.entity.Person;
import com.ssh.repository.PersonRepository;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by wangchenghao on 2017/7/28.
 */
@Repository
public class PersonRepositoryImpl implements PersonRepository{

    @Autowired
    private SessionFactory sessionFactory;

    private Session getCurrentSession(){
        return this.sessionFactory.openSession();
    }


    public Person load(Long id) {

        return (Person) getCurrentSession().load(Person.class, id);
    }

    public Person get(Long id) {

        return (Person) getCurrentSession().load(Person.class, id);
    }

    public List<Person> findAll() {
        return null;
    }

    public void persist(Person entity) {

        getCurrentSession().persist(entity);
    }

    public Long save(Person entity) {

        return (Long)getCurrentSession().save(entity);
    }

    public void saveOrUpdate(Person entity) {

        getCurrentSession().saveOrUpdate(entity);
    }

    public void delete(Long id) {

        Person person = load(id);
        getCurrentSession().delete(person);
    }

    public void flush() {

        getCurrentSession().flush();
    }
}
