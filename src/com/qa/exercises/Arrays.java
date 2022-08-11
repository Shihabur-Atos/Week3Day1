package com.qa.exercises;

import java.util.ArrayList;
import java.util.List;

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

    public int twodigit(int a) {
        String val = String.valueOf(a);
        int answer = 0;
        if (a > 9 && a < 100) {
            char[] digits = val.toCharArray();
            answer = digits[0] + digits[1];
        }
        return answer;
    }

    public String numToWord(int a) {
        String val = String.valueOf(a);
        StringBuilder theWord = new StringBuilder();
        ArrayList<Character> nums = new ArrayList<Character>();
        ArrayList<String> digits = new ArrayList<String>(List.of(new String[]{"","one","two","three","four","five","six","seven","eight","nine"}));
        if (a > 0 && a < 10) {
            for(int i = 0; i < val.length(); i++) {
                nums.add(val.charAt(i));
            }

            for (Character num : nums) {
                theWord.append(digits.indexOf(String.valueOf(num)));
            }
        }
        return theWord.toString();
    }
}
