package com.sagar.inheritence;

class A{

    public A() {
//        super();
        System.out.println("in A constructor");
    }
    public A(int n) {
//        super();
        this();
        System.out.println("in A int constructor");
    }
}

class B extends A{
    public B() {
//        super(); // if you don't specify also you have super by default
        System.out.println("in B constructor");
    }

    public B(int i) {
        this();
        System.out.println("in B int constructor");
    }
}

public class ThisNSuperDemo {
    public static void main(String[] args) {
        B obj= new B(5);
    }
}
