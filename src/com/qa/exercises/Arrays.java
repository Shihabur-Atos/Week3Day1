package com.qa.exercises;

import java.util.ArrayList;

public class Arrays {

    public static void main(String[] args) {
        ArrayList<Integer> intArray = new ArrayList<>(10);
        for(int i = 0; i < 10; i++) {
            intArray.add(i);
            //System.out.println(intArray.get(i));
        }
        System.out.print("Before: ");
        System.out.println(intArray);

        for(int i : intArray) {
            intArray.set(intArray.indexOf(i), i*10);
            //System.out.println(intArray.get(intArray.indexOf(i*10)));
        }
        System.out.print("After: ");
        System.out.println(intArray);
    }

    public void twodigit(int a) {
        if (a > 9 && a < 100) {

        }
    }
}
