package PatternPrinting;

import java.util.Scanner;

public class HalfPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter Rows : ");
        int rows = sc.nextInt();

        int spaceTemp = rows - 1;


        for (int i = 1; i <= rows; i++) {
            for (int j = 0; j < spaceTemp; j++) {
                System.out.print("  ");
            }
            spaceTemp--;
            for (int k = 0; k < i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
