package com.baeldung.persistence.service;


import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;
import org.springframework.transaction.annotation.Transactional;

import com.baeldung.hibernate.manyToMany.model.Employee;
import com.baeldung.hibernate.manyToMany.model.Project;
import com.baeldung.hibernate.manyToMany.service.IEmployeeService;
import com.baeldung.spring.PersistanceConfig;



@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {PersistanceConfig.class }, loader = AnnotationConfigContextLoader.class)
public class EmployeeServiceBasicPersistanceIntegrationTest {

    @Autowired
    private SessionFactory sessionFactory;

    @Autowired
    private IEmployeeService employeeService;

    private Session session;

    // tests

    @SuppressWarnings("deprecation")
    @Before
    @Transactional
    public final void before() {
        session = sessionFactory.getCurrentSession();
    }

    @After
    public final void after() {
        //session.close();
    }

    // tests

    @Test
    @Transactional
    public final void whenContextIsBootstrapped_thenNoExceptions() {
        //
    }

    @Test
    @Transactional
    public final void whenEntityIsCreated_thenNoExceptions() {
       Set<Project> projects = new HashSet<Project>();
       projects.add(new Project("IT"));
       projects.add(new Project("Business"));
       employeeService.create(new Employee("Peter", "Oven", projects));
    }

}
