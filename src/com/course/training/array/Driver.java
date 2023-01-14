package com.course.training.array;

public class Driver {

/*
    public static void main(String[] args) {

        /*

            {1,3,4,5}   4
            {1,2,3,4,5} --> 1 atandı

         */
/*
        int[] arr = {1,3,4,5};

        int[] newArr = new int[5]; // 0 0 0 0 0

        newArr[1] = 2; // 0 2 0 0 0

        for(int i = 0; i < arr.length;i++){
            if(i >= 1) {
                newArr[i+1] = arr[i];
            } else {
                newArr[i] = arr[i];
            }
        }



        int[] arr = {1,3,4,5};
        int[] returnArray = addElement(arr,2,1);

        printArr(returnArray);
        //printArr(arr);


    }*/


    public static void main(String[] args) {
        int[] arr = {1,3,4,5};
        int[] returnArray = addElement(arr,2,1);
        printArr(returnArray);
    }

    public static int[] addElement(int[] givenArr,int numberToBeAdded,int index){
        int[] newArr = new int[givenArr.length + 1];
        newArr[index] = numberToBeAdded;
        for(int i = 0; i < givenArr.length;i++){
            if(i >= index) {
                newArr[i+1] = givenArr[i];
            } else {
                newArr[i] = givenArr[i];
            }
        }
        return newArr;
    }

    public static void printArr(int[] parameterArr) {
        for(int i = 0; i < parameterArr.length;i++){
            System.out.print(parameterArr[i] + ", ");
        }
        System.out.println();
    }





}
