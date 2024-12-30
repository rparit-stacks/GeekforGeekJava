package ConditionalStatement;

import java.util.Scanner;

public class Absolute {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter a Number");
        int Number = sc.nextInt();
        if (Number < 0) Number *= -1;
        System.out.println(Number);

    }
}
