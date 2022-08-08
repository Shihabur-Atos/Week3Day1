package com.qa.exercises;

public class Results {
    int physics;
    int chemistry;
    int biology;
    int total;
    Calculator cal = new Calculator();
    static final int MAX_MARKS = 150;

    public Results(int physics, int chemistry, int biology) {
        this.physics = physics;
        this.chemistry = chemistry;
        this.biology = biology;
    }

    public static void main(String[] args) {
        Results myResult = new Results(100,85,65);
        myResult.printResults();
        myResult.printPercentage();
    }

    public void printResults() {
        this.total = cal.addition(this.physics, this.biology, this.chemistry);
        System.out.println("Your Results: " +
                "Physics = " + physics + " / " + MAX_MARKS +
                ", Chemistry = " + chemistry + " / " + MAX_MARKS +
                ", Biology = " + biology + " / " + MAX_MARKS +
                ", Total = " + total);
    }

    public Double calculatePercentage(int value, int total) {
        return (double) Math.round(cal.multiplication((cal.division(value, total)), 100));
    }

    public void printPercentage() {
        System.out.println("Your Results in %: " +
                "Physics = " +  + calculatePercentage(this.physics, MAX_MARKS) +
                "%, Chemistry = " + calculatePercentage(this.chemistry,MAX_MARKS) +
                "%, Biology = " + calculatePercentage(this.biology, MAX_MARKS) +
                "%, Total = " + calculatePercentage(this.total, cal.multiplication(MAX_MARKS, 3)) + "%");
    }

}
