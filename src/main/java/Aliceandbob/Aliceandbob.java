package Aliceandbob;

import java.util.Scanner;

public class Aliceandbob {
    public static void main(String[] args) {

        //Alice and Bob

        String str1 = "Alice";
        String str2 = "Bob";

        Scanner userInput = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = userInput.nextLine();


        if (name.equals("Alice") || name.equals("Bob")) {
            System.out.println("Welcome " + name + "!");
            System.out.println("What's your number?");
            String phoneNumber = userInput.nextLine();

            if (phoneNumber.length() == 10) {
                System.out.println("Got it!");
            } else {
                while (phoneNumber.length() != 10) {
                    System.out.println("Ten digit number please!");
                    phoneNumber = userInput.nextLine();

                    if (phoneNumber.length() == 10) {
                        System.out.println("Got it!");
                    }
                }
            }

        } else {
            while (name != ("Alice") || name != ("Bob")) {
                System.out.println("Try again :( ");
                name = userInput.nextLine();

                if (name.equals("Alice") || name.equals("Bob")) {
                    System.out.println("Welcome " + name + "!");
                    System.out.println("What's your number?");
                    String phoneNumber = userInput.nextLine();

                    while (phoneNumber.length() != 10) {
                        System.out.println("Ten digit number please!");
                        phoneNumber = userInput.nextLine();

                    }
                    if (phoneNumber.length() == 10)
                        System.out.println("Got it!");
                    break;

                }
            }


        }


    }
}