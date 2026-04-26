package com.sagar.emum;

enum laptop {
    DELL(2000), HP(1500), LENOVO(), MACBOOK(1100);
    private int price;

    laptop() {
        this.price = 400;
    }

    laptop(int price) {
        this.price = price;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
}
public class EnumDemo {
    public static void main(String[] args) {
//        laptop lap = laptop.DELL;
//        System.out.println(lap+ " :"+ lap.getPrice());
//        lap.setPrice(2300);
//        System.out.println(lap+ " :"+ lap.getPrice());

        laptop[] laptops = laptop.values();
        for (laptop l : laptops) {
            System.out.println(l + " : " + l.getPrice());
        }

    }
}
