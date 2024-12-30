package Array;

public class LargestInArray {
    public static void main(String[] args) {
        int[] num = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        System.out.println();
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < num.length; i++) {
            if (num[i] > max) max = num[i];
        }

        System.out.println(max);

    }
}
