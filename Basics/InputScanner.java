package Basics;

import java.util.Scanner;

public class InputScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a Number : ");
        int number = sc.nextInt();
        System.out.println();
        System.out.print("Please enter a String : ");
        String string = sc.next();

        System.out.println(number * number);
        System.out.println(string + string);
    }
}
