package com.denizsimsek.classes;

public class MyExample {
    private String name;
    private double age;

    public MyExample(String name, double age) {
        this.name = name;
        this.age = age;
        System.out.println("Default Constructor is called.");
    }

    public MyExample(String name) {
        this(name, 0);
        System.out.println("Overload Constructor with name parameter.");
    }

    public MyExample() {
        this("John", 0);
        System.out.println("Empty Constructor is called.");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public void exampleMethod() {
        System.out.println("Running example!");
    }

    public void exampleMethod(String text) {
        System.out.println("Method overloading " + text);
    }

    public static void exampleStatic() {
        System.out.println("This is a static method.");
    }
}
