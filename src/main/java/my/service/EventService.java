package my.service;

import my.dao.IEventDao;
import my.model.Event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class EventService {

    @Autowired
    private IEventDao dao;

    public EventService() {
        super();
    }

    // API

    public void create(final Event entity) {
        dao.create(entity);
    }

}
