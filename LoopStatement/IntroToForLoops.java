package LoopStatement;

import java.util.Scanner;

public class IntroToForLoops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the a Number : ");
        int number = sc.nextInt();

        //print "hello world" 100 times
        for (int i = 0; i < number; i++) {
            System.out.println("Hello World");
        }
    }
}
