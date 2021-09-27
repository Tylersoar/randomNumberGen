package com.company;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Random random = new Random();

        System.out.println("how many numbers do you want?");
        int numberinput = input.nextInt();

        System.out.println("What is your minimum number?");
        int min = input.nextInt();

        System.out.println("what is your maximum number");
        int max = input.nextInt();

        for (int i = 0; i < numberinput; i++) {
            System.out.println(random.nextInt((max-min) + 1) + min);
        }


//        Random random = new Random();
//        System.out.println("First random int is " + random.nextInt(10));
//        System.out.println("Second random double is " + random.nextDouble());
//
//        int min = 5;
//        int max = 10;
//        int newRandom = random.nextInt((max-min) + 1) + min;
//        System.out.println(newRandom);
    }
}
