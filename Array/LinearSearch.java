package Array;

public class LinearSearch {
    public static void main(String[] args) {
        int[] num = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        System.out.println();
        for (int i = 0; i < num.length; i++) {
            if (num[i] == 70) {
                System.out.print(i);
                break;
            }
        }

    }
}
