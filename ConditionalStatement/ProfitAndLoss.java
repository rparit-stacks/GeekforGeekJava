package ConditionalStatement;

import java.util.Scanner;

public class ProfitAndLoss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Original Price of the product : ");
        int costPrice = sc.nextInt();
        System.out.print("Enter the Selling Price of the product : ");
        int sellPrice = sc.nextInt();


        if (costPrice > sellPrice) {
            System.out.print("The seller bear a loss of " + (costPrice - sellPrice));
        } else {
            System.out.print("The seller have made a profit of " + (sellPrice - costPrice));
        }
    }
}
