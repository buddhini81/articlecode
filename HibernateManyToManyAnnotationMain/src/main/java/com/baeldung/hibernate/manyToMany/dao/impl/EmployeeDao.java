package com.baeldung.hibernate.manyToMany.dao.impl;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.baeldung.hibernate.manyToMany.dao.IEmployeeDao;
import com.baeldung.hibernate.manyToMany.dao.common.AbstractHibernateDao;
import com.baeldung.hibernate.manyToMany.model.Employee;

@Repository
public class EmployeeDao extends AbstractHibernateDao<Employee> implements IEmployeeDao {

    public EmployeeDao() {
        super();

        setClazz(Employee.class);
    }
}
