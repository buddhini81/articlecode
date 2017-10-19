package com.baeldung.hibernate.manyToMany.dao.impl;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.baeldung.hibernate.manyToMany.dao.IProjectDao;
import com.baeldung.hibernate.manyToMany.dao.common.AbstractHibernateDao;
import com.baeldung.hibernate.manyToMany.model.Project;

@Repository
public class ProjectDao extends AbstractHibernateDao<Project> implements IProjectDao {

    public ProjectDao() {
        super();

        setClazz(Project.class);
    }
}
