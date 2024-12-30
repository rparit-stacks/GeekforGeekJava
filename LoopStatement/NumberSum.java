package LoopStatement;

import java.util.Scanner;

public class NumberSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter a Number : ");
        int number = sc.nextInt();


        int sum = 0;
        while (number > 0) {
            int temp = number % 10;
            sum += temp;
            number = number / 10;
        }
        System.out.println(sum);
    }
}
