package LoopStatement;


import java.util.Scanner;

public class Gp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the a Number : ");
        int number = sc.nextInt();

        int num = 1;
        for (int i = 1; i <= number; i++) {
            num *= 2;
            System.out.println(num);
        }


    }
}

