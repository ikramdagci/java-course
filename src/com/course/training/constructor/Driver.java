package com.course.training.constructor;

public class Driver {

    public static void main(String[] args) {

        //Person.sayHi();
        //int x = Person.a;

        Person person = new Person("John Doe",24);
        //person.sayName();
        //person.sayAge();
        person.printInfo();

        Person person2 = new Person("John Doe2",26);
        //person2.sayName();
        //person2.sayAge();
        person2.printInfo();

        Person person3 = new Person();
        //person3.sayName();
        //person3.sayAge();
        person3.printInfo();

        Person person4 = new Person(26);
        //person4.sayName();
        //person4.sayAge();
        person4.printInfo();

        Person person5 = new Person("John Doe 5");
        //person5.sayName();
        // person5.sayAge();
        person5.printInfo();
        person5.age = 35;
        person5.printInfo();


        /*System.out.println(person.fullName);
        System.out.println(person.age);

        System.out.println(person2.fullName);
        System.out.println(person2.age);
*/



    }


}
