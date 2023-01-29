package com.course.inner.example;

public class Sequence {

    private Object[] objects;
    private int index;

    private int cursor;
    public Sequence(int size){ //10
        this.objects = new Object[size];
    }

    public void add(Object obj){
        if(index < objects.length){ //0 - 10 -> true
            this.objects[index++] = obj; // objects[0] = obj, index = 1
        }
    }




    public Iterator getIterator(){
        return new SequenceIterator();
    }

    public class SequenceIterator implements Iterator {

        private int index;

        @Override
        public boolean end() {
            return this.index == Sequence.this.index;
        }

        @Override
        public Object current() {
            return Sequence.this.objects[this.index];
        }

        @Override
        public void next() {
            if(this.index < Sequence.this.objects.length) {
                this.index++;
            }
        }
    }




}
