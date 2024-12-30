package ConditionalStatement;

import java.util.Scanner;

public class ThreeDigitNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the a Number : ");
        int number = sc.nextInt();

        if (number > 99 && number < 1000) System.out.printf("The Number " + number + " is three digit number");
        else System.out.printf("The Number " + number + " is not three digit number");


    }
}