package com.qa.exercises;

public class Iterate {

    public static void main(String[] args) {
        Iterate it = new Iterate();
    }

    public void flow1() {
        int a = 100;
        while(!(a > 200)) {
            System.out.println("A");
            a++;
        }
    }

    public void flow2() {
        int a = 100;
        for(;a <= 200; a++) {
            if(a % 2 ==0) {
                System.out.println("-");
            } else {
                System.out.println("*");
            }
        }
    }

    public void print10() {
        for (int i = 0; i < 10; i++) {
            for(int a = 1; a < 10; a++){
                System.out.print(a + " ");
            }
            System.out.println();
        }
    }

    public void printValNum() {
        for(int i = 0; i <= 10; i++) {
            for(int c = 0; c < i; c++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
