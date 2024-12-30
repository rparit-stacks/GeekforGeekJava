package LoopStatement;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int counter = 0;
        //Prime Number
        System.out.print("Please Enter a Number : ");
        int number = sc.nextInt();

        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                counter++;
                break;
            }
        }
        if (counter == 0) {
            System.out.println("Prime Number");
        } else {
            System.out.println("Not Prime Number");
        }

    }

}
