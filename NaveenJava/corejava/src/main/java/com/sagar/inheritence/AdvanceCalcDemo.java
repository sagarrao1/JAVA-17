package com.sagar.inheritence;

import com.sagar.inheritence.calc.AdvCalc;

public class AdvanceCalcDemo {
    public static void main(String[] args) {
        AdvCalc obj= new AdvCalc();
        int r1= obj.add(17,4);
        int r2= obj.sub(17,4);
        double r3 = obj.multi(5, 4);
        int r4= obj.div(17,4);
        System.out.println(r1 +" "+r2 +" "+r3 +" "+r4 );
    }
}
