package ConditionalStatement;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();

        if (n % 2 != 0) System.out.print("An odd number");
        else System.out.print("An even number");
    }
}
