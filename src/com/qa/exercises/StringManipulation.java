package com.qa.exercises;

public class StringManipulation {
    public static void main(String[] args) {
        String val1 = "yesterday it was raining";
        String val2 = "today it is sunny";
        String finalVal = val2.toUpperCase() + ", " + val1.toUpperCase();
        System.out.println(finalVal);

        System.out.println(val2.substring(0, val2.indexOf("s") + 1).toUpperCase() + val1.substring(val1.indexOf(" r")).toUpperCase());
    }

    public int wordCount(String sentence) {
        int count = 0;
        
        for(int i = 0;i < sentence.length(); i++) {

        }
        return count;
    }
}
