package com.course.training.initialization;

public class GUI {

    public GUI(){
        System.out.println("GUI Constructor");
        System.out.println("Before component draw");
        drawToScreen();
        System.out.println("After component draw");
    }

    public void drawToScreen() {
        System.out.println("GUI.drawToScreen");
    }

}
