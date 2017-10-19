package my.test;

import my.model.Event;
import my.service.EventService;

import org.hibernate.HibernateException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring-config.xml" })
public class TestwithXMLConfig {

    @Autowired
    EventService service;
    
    @Test
    public final void whenEntityIsCreated_thenNoExceptions() {
        service.create(new Event("wwwwww"));
    }
}
