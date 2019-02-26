package com.mateacademy.classes;

public class ClassesApp {
    public static void main(String[] args) {
        Outer.Inner inner = new Outer().new Inner(); //Nested inner class
        inner.print();

        Outer.StaticInner staticInner = new Outer.StaticInner(); //Static nested class
        staticInner.print();

        Outer outer = new Outer(); //Method local inner class
        outer.outerMethod();

        Outer.test.print();  //Anonymous inner class(extends class)
        Outer.anonymous.sayHello();  //Anonymous inner class(implements interface)
    }
}
