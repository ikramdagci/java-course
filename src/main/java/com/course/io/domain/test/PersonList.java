package com.course.io.domain.test;

import com.course.collections.domain.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PersonList {

    List<Person> people = new ArrayList<Person>();
    Scanner scanner = new Scanner(System.in);
    public void start() {
        //{}
        boolean run = true;
        while(run) {
            System.out.println("Enter operation:\n1. Add person\n2. List all\n3. Exit");
            int selection = scanner.nextInt();
            switch (selection) {
                case 1:
                    addPerson();
                    break;
                case 2:
                    listAll();
                    break;
                case 3:
                    run = false;
                    break;
                default:
                    System.out.println("Not implemented yet!");
            }
        }


        // char-oriented -> 16-bit
        // byte-oriented -> 8-bit

        // persistence

    }

    private void listAll() {
        System.out.println(people);
    }

    public  void addPerson(){
        System.out.println("Enter person name");
        scanner.nextLine();
        String name = scanner.nextLine();
        System.out.println("Enter person id");
        String id = scanner.next();
        Person person = new Person(name, id);
        people.add(person);
    }

    public void readFile(){
        String personString = "Person{name='Oğuzhan Karataş', id='1'}";
        char[] chars = personString.toCharArray();
        String name = "";
        for(int i = 13; ;i++){
            if(chars[i] == '\'') break;
            name += chars[i];
        }
        System.out.println(name);

        //new Person(name,id);
    }
}
