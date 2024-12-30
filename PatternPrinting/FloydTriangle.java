package PatternPrinting;

import java.util.Scanner;

public class FloydTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter Rows : ");
        int rows = sc.nextInt();
        int temp = 1;


        for (int i = 1; i <= rows; i++) {
            for (int k = 0; k < i; k++) {
                System.out.print(temp++ + " ");
            }
            System.out.println();
        }
    }
}
