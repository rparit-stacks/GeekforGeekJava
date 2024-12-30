package Array;

import java.util.Arrays;

public class CopyOfArray {
    public static void main(String[] args) {
        int[] num = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        for (int ele : num) {
            System.out.print(ele + " ");
        }
        System.out.println();

        int[] nums = num; // shallow copy
        int[] newArray = Arrays.copyOf(num, num.length); //DeepCopy

        for (int ele : nums) {
            System.out.print(ele + " ");
        }

    }
}
