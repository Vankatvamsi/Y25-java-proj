package com.labs;


//Parent class
class Animal {
 void sound() {
     System.out.println("Animal makes a sound");
 }
}

//Child class 1
class Dog extends Animal {
 void sound() {
     System.out.println("Dog barks");
 }
}

//Child class 2
class Cat extends Animal {
 void sound() {
     System.out.println("Cat meows");
 }
}

public class PolymorphismDemo {

 public static void main(String[] args) {

     // Parent reference, child objects
     Animal a;

     a = new Dog();   // Dynamic Dispatch
     a.sound();       // calls Dog's sound()

     a = new Cat();   // Dynamic Dispatch
     a.sound();       // calls Cat's sound()

 }
}

