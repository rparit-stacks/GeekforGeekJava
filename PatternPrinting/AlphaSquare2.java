package PatternPrinting;

import java.util.Scanner;


public class AlphaSquare2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter Rows and Cols : ");
        int rows = sc.nextInt();
        int cols = sc.nextInt();


        for (int i = 0; i < rows; i++) {
            for (int j = 1; j <= cols; j++) {
                System.out.print((char) (i + 65) + " ");
            }
            System.out.println();
        }
    }

}
