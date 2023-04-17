package com.course.jdbc.dal;

public interface CrudDataAccessLayer<T> {

    T findById(int id);

}
