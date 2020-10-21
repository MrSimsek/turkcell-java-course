package com.denizsimsek.classes;

public class Person implements Greetings, Movement {
    private String name;
    private int age;
    private Gender gender;

    public Person(String name, int age, Gender gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        System.out.println("Default Constructor is called.");
    }

    public Person(String name) {
        this(name, 0, Gender.MALE);
        System.out.println("Overload Constructor with name parameter.");
    }

    public Person() {
        this("John", 0, Gender.MALE);
        System.out.println("Empty Constructor is called.");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
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

    public void introduce() {
        System.out.println("Hello, I am " + name + " and I am " + age + " years old. And I am a " + (gender.equals(Gender.MALE) ? "dude" : "girl"));
    }

    public void walk() {
        System.out.println(name + " is walking.");
    }

    public void run() {
        System.out.println(name + " is running.");
    }
}
