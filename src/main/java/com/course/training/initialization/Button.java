package com.course.training.initialization;

public class Button extends GUI{

    private int value = 11;

    public Button(int value){
        this.value = value;
        System.out.println("Button.value : " + this.value);
    }

    public void drawToScreen(){
        System.out.println("Button.drawToScreen, value :" + this.value);
    }

}
