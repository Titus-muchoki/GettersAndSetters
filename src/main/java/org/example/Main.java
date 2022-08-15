package org.example;

import org.example.models.Rectangle;

public class Main {
    public Main() {

    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(2, 4);
        rectangle.getLength();

System.out.println(rectangle);
        System.out.println("Hello world!");
    }
}