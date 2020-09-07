package ru.lizaminakova.JAVA1.Pr2;

public class Main {
    public static void main(String[] args) {
        Shape shape = new Shape("Green", 5);
        Shape shape2 = new Shape("Black", 3);
        System.out.println(shape.getColor());
        shape.setColor("Blue");
        System.out.println(shape.getSidesCount());
    }
}
