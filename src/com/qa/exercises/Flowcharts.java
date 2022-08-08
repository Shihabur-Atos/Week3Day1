package com.qa.exercises;

public class Flowcharts {
    public int flow1(int a, int b, boolean c) {
        if(c) {
            return a + b;
        } else {
            return a * b;
        }
    }

    public void complexFlowchart(int a) {
        if(a > 2000) {
            System.out.println("A");
            if(a > 6000) {
                System.out.println("C");
            } else {
                System.out.println("B");
                if(a > 4000) {
                    System.out.println("D");
                } else {
                    System.out.println("E");
                }
            }
        } else {
            System.out.println("1");
            if(a > 100) {
                System.out.println("3");
                if(a > 600) {
                    System.out.println("5");
                } else {
                    System.out.println("4");
                    if(a > 500) {
                        System.out.println("6");
                    } else {
                        System.out.println("7");
                    }
                }
            } else {
                System.out.println("2");
            }
        }
    }

    public int blackJack(int a, int b) {
        if(a > b) {
            if(a <= 21) {
                return a;
            } else {
                return 0;
            }
        } else {
            if(b <= 21) {
                return b;
            } else {
                return 0;
            }
        }
    }

    public int uniqueSum(int a, int b, int c) {
        int sum = 0;
        if(a != b) {
            sum = a + b;
        }
        if(b != c) {
            sum = b + c;
        } else {
            return sum;
        }
        return sum;
    }


}
