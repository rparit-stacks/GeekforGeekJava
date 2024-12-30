package ConditionalStatement;

import java.util.Scanner;

public class MaxOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A Number : ");
        int number = sc.nextInt();
        System.out.print("Enter B Number : ");
        int number2 = sc.nextInt();
        System.out.print("Enter C Number : ");
        int number3 = sc.nextInt();

        if (number > number2 && number > number3)
            System.out.println("Number " + number + " is greater than the All number");
        else if (number2 > number && number2 > number3)
            System.out.println("Number " + number2 + " is greater than the All number");
        else
            System.out.println("Number " + number3 + " is greater than the All number");
    }
}
