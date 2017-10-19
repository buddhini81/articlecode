package com.baeldung.hibernate.manyToMany.dao.common;

import java.io.Serializable;

public abstract class AbstractDao<T extends Serializable> implements IOperations<T> {

    protected Class<T> clazz;

    protected final void setClazz(final Class<T> clazzToSet) {
        clazz = clazzToSet;
    }

}
