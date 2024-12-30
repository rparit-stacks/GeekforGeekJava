package ConditionalStatement;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int side1, side2, side3;
        System.out.printf("Enter the side A of the triangle: ");
        side1 = sc.nextInt();
        System.out.printf("Enter the side B of the triangle: ");
        side2 = sc.nextInt();
        System.out.printf("Enter the side C of the triangle: ");
        side3 = sc.nextInt();


        if (side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1)
            System.out.println("This is a Triangle");
        else
            System.out.println("This is NOT a Triangle");
    }
}
