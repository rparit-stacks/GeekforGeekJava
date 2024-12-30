package Array;

import java.util.*;
import java.util.Scanner;

public class Intro {
    public static void main(String[] args) {
        int[] marks = new int[100];
        int[] mark = {10, 20, 30, 40, 50};
        int[] nMakes = new int[10];

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            marks[i] = sc.nextInt();
        }
        for (int i = 0; i < 10; i++) {
            System.out.print(marks[i] + " ");
        }

    }

}
