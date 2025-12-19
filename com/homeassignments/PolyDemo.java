package com.homeassignments;
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}
public class PolyDemo {
    public static void main(String[] args) {
    	System.out.println("ID no: 2500031933");
        Animal a;
        a = new Dog();
        a.sound();
        a = new Cat();
        a.sound();
        }
}
