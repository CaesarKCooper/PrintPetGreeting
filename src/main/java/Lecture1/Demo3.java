package Lecture1;

import java.util.Arrays;

public class Demo3 {
    public static String[] returnAnArray(String[] input) {

        return input;
    }


    public static void main(String[] args) {

        String[] nickNames = {"CodeHunter", "MylesOfCode", "SupreNova", "lil Cease"};


        System.out.println(Arrays.toString(returnAnArray(nickNames)));

    }
}
