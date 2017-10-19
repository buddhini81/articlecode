package my.dao;

import my.model.Event;

import org.springframework.stereotype.Repository;

@Repository
public class EventDao extends AbstractHibernateDao<Event> implements IEventDao {

    public EventDao() {
        super();

        setClazz(Event.class);
    }

    // API

}
