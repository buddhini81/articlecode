package my.test;


import static org.apache.commons.lang3.RandomStringUtils.randomAlphabetic;
import my.model.Event;
import my.service.EventService;
import my.spring.PersistenceConfig;

import org.hibernate.HibernateException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateSystemException;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { PersistenceConfig.class }, loader = AnnotationConfigContextLoader.class)
public class Test123 {
    
    @Autowired
    EventService service;
    
    @Test
    public final void whenEntityIsCreated_thenNoExceptions() {
        service.create(new Event("wwwwww"));
    }

}
