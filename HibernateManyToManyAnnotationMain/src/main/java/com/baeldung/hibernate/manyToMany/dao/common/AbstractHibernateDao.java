package com.baeldung.hibernate.manyToMany.dao.common;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;


@SuppressWarnings("unchecked")
public abstract class AbstractHibernateDao<T extends Serializable> extends AbstractDao<T> implements IOperations<T> {

    @Autowired
    protected SessionFactory sessionFactory;

    // API

    @Transactional
    public T findOne(final long id) {
        return (T) getCurrentSession().get(clazz, id);
    }

    @Transactional
    public List<T> findAll() {
        return getCurrentSession().createQuery("from " + clazz.getName()).list();
    }

    @Transactional
    public void create(final T entity) {
        getCurrentSession().saveOrUpdate(entity);
    }

    @Transactional
    public T update(final T entity) {
        return (T) getCurrentSession().merge(entity);
    }

    @Transactional
    public void delete(final T entity) {
        getCurrentSession().delete(entity);
    }

    @Transactional
    public void deleteById(final long entityId) {
        final T entity = findOne(entityId);
        delete(entity);
    }

    protected Session getCurrentSession() {
        return sessionFactory.getCurrentSession();
    }

}