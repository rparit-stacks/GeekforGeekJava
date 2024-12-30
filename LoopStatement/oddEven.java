package LoopStatement;

import java.util.Objects;
import java.util.Scanner;

public class oddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the a Number : ");
        int number = sc.nextInt();

        System.out.print("Select odd/even : ");
        String selection = sc.next();
        if (Objects.equals(selection, "odd"))
            for (int i = 0; i <= number; i++) {
                if (i % 2 == 0) System.out.println(i);
            }
        else
            for (int i = 0; i <= number; i++) {
                if (i % 2 != 0) System.out.println(i);
            }
    }

}

