package com.course.jdbc.dal.dao;

import com.course.jdbc.dal.CrudDataAccessLayer;
import com.course.polymorphism.domain.Circle;

public class DummyCircleDao implements CrudDataAccessLayer<Circle> {
    @Override
    public Circle findById(int id) {
        return null;
    }
}
