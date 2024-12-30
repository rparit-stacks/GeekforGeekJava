package LoopStatement;

import java.util.Scanner;

public class CompositeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int counter = 0;
        // Composite Number
        System.out.print("Please Enter a Number : ");
        int number = sc.nextInt();

        sc.close();

        for (int i = 1; i < number; i++) {
            if (number % i == 0)
                counter++;
        }

        if (counter >= 2)
            System.out.println(number + " Is a Composite Number");
        else
            System.out.println(number + " Is NOT a Composite Number");
    }

}
