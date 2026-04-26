package com.sagar.collections.CollectionGenerics;

import java.util.ArrayList;
import java.util.List;

//Create our own generics class
class Container<T extends Number> {
    private T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public void show() {
        System.out.println(value.getClass().getName());
    }

    public void demo(ArrayList<? extends T> obk) {

    }
}

public class GenericsDemo {
    public static void main(String[] args) {
        int v = 5;
        List values = new ArrayList();
        values.add(7);
        values.add("Sagar");
        //System.out.println(values.get(1).toString());
        //int i=Integer.parseInt(values.get(1).toString());

        Container<Number> obj = new Container<>();
        obj.setValue(7.8);
        obj.show();
        obj.demo(new ArrayList<Integer>());

    }

}
