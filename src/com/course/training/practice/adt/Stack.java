package com.course.training.practice.adt;

public interface Stack<T> {

    /**
     * just returns the topmost element
     * @return element
     */
    T peek();

    /**
     * the topmost element is returned and also that element is deleted from the stack
     * @return element
     */
    T pop();

    /**
     * add element to stack
     * @param t element
     */
    void push(T t);


    boolean isEmpty();


}
