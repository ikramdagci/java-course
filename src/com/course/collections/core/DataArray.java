package com.course.collections.core;

public class DataArray<T> {


    private Object[] objects;
    private int capacity;
    private int cursor;


    public DataArray(int capacity) {
        if(capacity < 1) {
            capacity = 10;
        }
        this.capacity = capacity;
        this.cursor = 0;
        this.objects = new Object[capacity];
    }

    public void add(T t) {
        ensureCapacity();
        objects[cursor++] = t;
    }

    @SuppressWarnings("unchecked")
    public T get(int index){
        return (T)this.objects[index];
    }

    public void delete(int index) {
        this.objects[index] = null;
        arrange(index);
        cursor--;
    }

    public int size(){
        return cursor;
    }


    //* _ * *
    private void arrange(int index) {
        for(int i = index;i < this.objects.length - 1;i++){
            this.objects[i] = this.objects[i+1];
        }
        this.objects[this.objects.length - 1] = null;

    }


    private void ensureCapacity() {
        System.out.println("Checking capacity: cursor = " + cursor + "; capacity= " + capacity);
        if (cursor >= capacity) {
            int newCapacity = capacity + (capacity >> 1);
            System.out.println("Capacity is growing: new capacity: " + newCapacity);
            grow(newCapacity);
        }

    }

    private void grow(int newCapacity) {
        Object[] newObjects = new Object[newCapacity];
        System.out.println("New larger array created with capacity: " + newCapacity);
        this.capacity = newCapacity;
        System.arraycopy(this.objects,0,newObjects,0,this.objects.length);
        this.objects = newObjects;
    }

    public Object[] getObjects() {
        return objects;
    }


}
