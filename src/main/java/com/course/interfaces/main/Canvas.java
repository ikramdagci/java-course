package com.course.interfaces.main;

import com.course.interfaces.Circle;
import com.course.interfaces.Colorable;
import com.course.interfaces.Drawable;
import com.course.interfaces.Rectangle;

public class Canvas {

    public void draw(Circle circle){
        circle.draw();
    }

    public void draw(Rectangle rectangle){
        rectangle.draw();
    }

    public void draw(Drawable drawable){
        drawable.draw();
    }

    public void color(Colorable colorable,String color){
        colorable.setColor(color);
    }


}
