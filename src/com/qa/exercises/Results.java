package com.qa.exercises;

public class Results {
    int physics, chemistry, biology, total;
    Calculator cal = new Calculator();
    static final int MAX_MARKS = 150;

    public Results(int physics, int chemistry, int biology) {
        this.physics = physics;
        this.chemistry = chemistry;
        this.biology = biology;
    }

    public static void main(String[] args) {
        Results myResult = new Results(84,84,50);
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
        return (double) Math.round(cal.multiplication((cal.division(value, total)), 100) * 100) / 100;
    }

    public void printPercentage() {
        Double physicsVal = calculatePercentage(this.physics, MAX_MARKS);
        Double chemistryVal = calculatePercentage(this.chemistry, MAX_MARKS);
        Double biologyVal = calculatePercentage(this.biology, MAX_MARKS);
        Double totalVal = calculatePercentage(this.total, cal.multiplication(MAX_MARKS, 3));

        System.out.println("Your Results in %: " +
                "Physics = " + +physicsVal +
                "%, Chemistry = " + chemistryVal +
                "%, Biology = " + biologyVal +
                "%, Total = " + totalVal + "%");

        if (totalVal < 60.00) {
            System.out.print("You have failed due to your total percentage, please see below why:\n");
        }
        if (physicsVal < 60 && chemistryVal < 60 && biologyVal < 60) {
            System.out.print("You failed all your modules.");
        } else if (physicsVal < 60 || biologyVal < 60 || chemistryVal < 60) {
            System.out.println("Due to: ");
            if (biologyVal < 60) {
                System.out.println("Biology");
            }
            if (chemistryVal < 60) {
                System.out.println("Chemistry ");
            }
            if(physicsVal < 60) {
                System.out.println("Physics");
            }
            System.out.println("You have failed unfortunately");
        } else {
            System.out.println("You have passed. Congratulations");
        }
    }

}
