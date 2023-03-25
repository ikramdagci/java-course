package com.course.generics;

import com.course.generics.core.TableGenerator;
import com.course.generics.model.Cargo;
import com.course.generics.model.Table;

import java.util.ArrayList;

public class Driver {

    public static void main(String[] args) {
        test2();

        Integer integer = Driver.<Integer>printValue(5);


        ArrayList<String> arrayList = new ArrayList<>();
        ArrayList<Integer> integers = new ArrayList<>();

        boolean b = arrayList.getClass() == integers.getClass();

        System.out.println(b);

    }
    public static void test2(){
        Cargo<Table> cargo = new Cargo<Table>();
        Table table = new Table();
        cargo.setCarriedItem(table);
        receiveCargo(cargo);

        TableGenerator tableGenerator = new TableGenerator();
        Table generate = tableGenerator.generate();
        System.out.println(generate);
        Table generate1 = tableGenerator.generate();
        System.out.println(generate1);

    }

    public static void receiveCargo(Cargo<Table> cargo){
        Table carriedItem = cargo.getCarriedItem();
        System.out.println(carriedItem);
    }

    public static <T> T printValue(T t){
        System.out.println(t.toString());
        return t;
    }

    public static boolean contains(ArrayList<String> nameList,String targetName) {
        for(String name : nameList) {
            if(name.equals(targetName)) {
                return true;
            }
        }
        return false;
    }

    public static void test1(){
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("John");
        String s = arrayList.get(0);

    }
}
