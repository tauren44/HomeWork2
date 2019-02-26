package com.mateacademy.classes;

public class Outer {

    class Inner {  //Nested inner class
        public void print() {
            System.out.println("I am an inner method");
        }
    }

    static class StaticInner {  //Static nested class
        public void print() {
            System.out.println("I am a static inner method");
        }
    }

    public void outerMethod() {  //Method local inner class
        System.out.println("outer class method");

        class Inner {
            private void innerMethod() {
                System.out.println("inner class method");
            }
        }
        Inner inner = new Inner();
        inner.innerMethod();
    }

    static Test test = new Test() {
        public void print() {
            super.print();
            System.out.println("anonymous inner class method");
        }
    };

    static Anonymous anonymous = new Anonymous() {
        @Override
        public void sayHello() {
            System.out.println("Hello from inner anonymous class");
        }
    };
}
