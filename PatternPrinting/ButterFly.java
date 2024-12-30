package PatternPrinting;

import java.util.Scanner;

public class ButterFly {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter Rows: ");
        int rows = sc.nextInt();
        sc.close(); // Close the scanner to prevent resource leaks

        int spaceTemp = rows - 1;

        // Top half of the butterfly pattern
        for (int i = 1; i <= rows; i++) {
            // Print left side stars
            for (int a = 0; a < i; a++) {
                System.out.print("* ");
            }

            // Print spaces in the middle
            for (int j = 0; j < spaceTemp * 2; j++) {
                System.out.print("  ");
            }

            // Print right side stars
            for (int k = 0; k < i; k++) {
                System.out.print("* ");
            }

            System.out.println();
            spaceTemp--;
        }

        int tempA = rows;
        int tempB = rows;
        int spaceCount = 0;

        // Bottom half of the butterfly pattern
        for (int i = 1; i <= rows; i++) {
            // Print left side stars
            for (int j = 0; j < tempA; j++) {
                System.out.print("* ");
            }

            tempA--;

            // Print spaces in the middle
            for (int k = 0; k < spaceCount * 2; k++) {
                System.out.print("  ");
            }

            spaceCount++;

            // Print right side stars
            if (i > 1) {
                for (int a = 0; a < i - 1; a++) {
                    System.out.print("  ");
                }
            }
            for (int k = 0; k < tempA + 1; k++) {
                System.out.print("* ");
            }
            tempB--;

            System.out.println();
        }
    }
}
