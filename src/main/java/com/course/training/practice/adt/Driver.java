package com.course.training.practice.adt;

public class Driver {

    public static void main(String[] args) {
        IntegerStackImpl integerStack = new IntegerStackImpl();

        integerStack.push(1);
        integerStack.push(2);
        integerStack.push(3);

        Integer pop = integerStack.pop();
        // pop = 3
        Integer peek = integerStack.peek();
        Integer peek1 = integerStack.peek();
        // peek 1 = 2, peek = 2
        Integer pop1 = integerStack.pop();
        // pop1 = 2

        if(integerStack.isEmpty()) System.out.println("No such element");
        while(!integerStack.isEmpty()) {
            System.out.println(integerStack.pop());
        }


    }

}
