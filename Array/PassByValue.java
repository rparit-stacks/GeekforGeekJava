package Array;

import static java.util.Collections.swap;

public class PassByValue {
    public static void reverseArray(int[] nums) {
        int i = 0, j = nums.length - 1;
        while (i < j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }

        for (int ele : nums) {
            System.out.print(ele + " ");
        }
    }

    public static void main(String[] args) {
        int[] num = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        reverseArray(num);
        System.out.println();
        for (int ele : num) {
            System.out.print(ele + " ");
        }

    }
}
