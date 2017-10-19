package com.baeldung.hibernate.manyToMany.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baeldung.hibernate.manyToMany.dao.IEmployeeDao;
import com.baeldung.hibernate.manyToMany.service.IEmployeeService;
import com.baeldung.hibernate.manyToMany.dao.common.IOperations;
import com.baeldung.hibernate.manyToMany.model.Employee;
import com.baeldung.hibernate.manyToMany.service.common.AbstractHibernateService;

@Service
public class EmployeeService extends AbstractHibernateService<Employee> implements IEmployeeService {

    @Autowired
    private IEmployeeDao dao;

    public EmployeeService() {
        super();
    }

    // API

    @Override
    protected IOperations<Employee> getDao() {
        return dao;
    }
}
