package LoopStatement;

import java.util.Scanner;

public class CountDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter a Number : ");
        int number = sc.nextInt();

        int counter = 0;
        while (number > 0) {
            number = number / 10;
            counter++;
        }
        System.out.println(counter);

    }

}
