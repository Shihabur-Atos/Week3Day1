package com.qa.exercises;

public class Iterate {

    public static void main(String[] args) {
        Iterate it = new Iterate();
        it.coins(20,4.58);
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

    public void coins(int note, double cost) {
        double change = ((note - cost) * 100) / 100;
        double[] currency = {50, 20, 10, 5, 2, 1, 0.5, 0.2, 0.1, 0.05 ,0.02, 0.01};

        while(change != 0){
            if(change > 20) {
                change = change / 20;
                System.out.println("£20 note");
            } else if (change - 10 >- 0) {
                change = change - 10;
                System.out.println("£10 note");
            } else if (change - 5 >= 0) {
                change = change - 5;
                System.out.println("£5 note");
            } else if (change - 2 >= 0) {
                change = change - 2;
                System.out.println("£2 coin");
            } else if (change - 1 >= 0) {
                change--;
                System.out.println("£1 coin");
            } else if (change - 0.5 >= 0) {
                change = change - 0.5;
                System.out.println("50p coin");
            } else if (change - 0.2 >= 0) {
                change = change - 0.2;
                System.out.println("20p coin");
            } else if (change - 0.1 >= 0) {
                change = change - 0.1;
                System.out.println("10p coin");
            } else if (change - 0.05 >= 0) {
                change = change - 0.05;
                System.out.println("5p coin");
            } else if (change - 0.02 >= 0) {
                change = change - 0.02;
                System.out.println("2p coin");
            } else if (change - 0.01 >= 0) {
                change = change - 0.01;
                System.out.println("1p coin");
            }
        }
        }
}
