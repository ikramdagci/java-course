package com.course.collections.main;

import com.course.collections.domain.Apple;
import com.course.collections.domain.Orange;
import com.sun.corba.se.impl.orbutil.graph.GraphImpl;

import java.util.*;

public class DriverCollections {

    /*
     Abstract Data Types - ADT

     - List
     - Set
     - Queue

     - Map

     */

    public static void main(String[] args) {
        //test4();
//        remove(1);
//        test5();
        test6();

    }
    public static void test6(){
        LinkedList<String> linkedList = new LinkedList<String>();
        linkedList.add("A");
        linkedList.add("B");
        linkedList.add("C");

        System.out.println(linkedList.getLast());

        for(int i = 0; i < linkedList.size();i++){
            System.out.println(linkedList.get(i));
        }

        for(String item : linkedList){
            System.out.println(item);
        }



    }
    public static void test5(){

        //String[] letters = "A B C D E F G H K L M N U T W R F Z P X Y Z".split(" ");
        Random random = new Random();
        ArrayList<Integer> arrayList = new ArrayList<>();

        for(int i = 0; i < Integer.MAX_VALUE / 4;i++){
            arrayList.add(i);
        }

        System.out.println("Finished");

    }
    public static String remove(int index) { // 1

        int size = 4;
        String[] elementData = new String[]{"A","B","C","D"};
        String s = Arrays.toString(elementData);
        System.out.println(s);

        String oldValue = elementData[index];

        int numMoved = size - index - 1;

        if (numMoved > 0){
            System.arraycopy(elementData, index+1, elementData, index,
                    numMoved);

        }
        String s1 = Arrays.toString(elementData);
        System.out.println(s1);

        elementData[--size] = null; // clear to let GC do its work

        return oldValue;
    }

    public static void test4(){
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("C");
        arrayList.add("D");
        System.out.println(arrayList);
        arrayList.remove(1);
        System.out.println(arrayList);


    }

    public static void test3(){
        ArrayList<String> list = new ArrayList<>();
        list.indexOf(new Object());
        Collection<String> list2 = new GraphImpl();

    }

    public static void test2(){
        Collection<String> stringCollection = new Collection<String>() {
            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean contains(Object o) {
                return false;
            }

            @Override
            public Iterator<String> iterator() {
                return null;
            }

            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @Override
            public <T> T[] toArray(T[] a) {
                return null;
            }

            @Override
            public boolean add(String s) {
                return false;
            }

            @Override
            public boolean remove(Object o) {
                return false;
            }

            @Override
            public boolean containsAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean addAll(Collection<? extends String> c) {
                return false;
            }

            @Override
            public boolean removeAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean retainAll(Collection<?> c) {
                return false;
            }

            @Override
            public void clear() {

            }
        };



    }

    public static void test1(){
        ArrayList<Apple> apples = new ArrayList<Apple>();

        apples.add(new Apple());
        apples.add(new Apple());
        apples.add(new Apple());
//        apples.add(new Orange()); // compile error



        for (int i = 0; i < apples.size(); i++) {
            Object o = apples.get(i); // unnecessary
            Apple apple = (Apple)o;   // safe but unnecessary
            Apple apple1 = apples.get(i); // ---- !!! ----
            int id = apple1.getId();
            System.out.println("Apple id : " + id);
        }

    }
    public static void test(){
        ArrayList apples = new ArrayList();

        apples.add(new Apple());
        apples.add(new Apple());
        apples.add(new Apple());
        apples.add(new Orange()); /// !!!!!!



        for (int i = 0; i < apples.size(); i++) {
            Object o = apples.get(i);
            Apple apple = (Apple)o;  // may occur class cast exception
            int id = apple.getId();
            System.out.println("Apple id : " + id);
        }

    }


    /*
    static Object[] elementData = new Object[10];
    static int cursor;
    public static void add(Apple apple){
        elementData[cursor++] = apple;
    }

    public static Apple get(int index){
        return (Apple)elementData[index];
    }
*/
}
