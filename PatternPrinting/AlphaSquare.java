package PatternPrinting;

import java.util.Scanner;

public class AlphaSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter Rows and Cols : ");
        int rows = sc.nextInt();
        int cols = sc.nextInt();


        for (int i = 1; i < rows; i++) {
            for (int j = 65; j < 65 + cols; j++) {
                System.out.print((char) j + " ");
            }
            System.out.println();
        }
    }
}
