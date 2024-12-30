package PatternPrinting;

import java.util.Scanner;

public class zeroOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter Rows : ");
        int rows = sc.nextInt();


        int temp;
        for (int i = 1; i <= rows; i++) {
            temp = i % 2;
            for (int j = 1; j <= i; j++) {
                System.out.print(temp + " ");
                if (temp == 0) temp = 1;
                else temp = 0;

            }

            System.out.println();
        }
    }
}
