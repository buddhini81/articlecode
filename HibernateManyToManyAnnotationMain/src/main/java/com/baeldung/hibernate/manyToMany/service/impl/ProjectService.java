package com.baeldung.hibernate.manyToMany.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baeldung.hibernate.manyToMany.dao.IProjectDao;
import com.baeldung.hibernate.manyToMany.dao.common.IOperations;
import com.baeldung.hibernate.manyToMany.model.Project;
import com.baeldung.hibernate.manyToMany.service.IProjectService;
import com.baeldung.hibernate.manyToMany.service.common.AbstractHibernateService;

@Service
public class ProjectService extends AbstractHibernateService<Project> implements IProjectService {
   
    @Autowired
    private IProjectDao dao;

    public ProjectService() {
        super();
    }

    // API

    @Override
    protected IOperations<Project> getDao() {
        return dao;
    }
}
