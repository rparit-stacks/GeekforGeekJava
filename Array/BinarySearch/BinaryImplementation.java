package Array.BinarySearch;

public class BinaryImplementation {
    public static void main(String[] args) {
        int[] nums = {1, 2, 4, 6, 7, 8, 9, 11, 14, 16, 18, 19, 23, 25};
        int start = 0;
        int end = nums.length;
        int target = 14;


        while (start <= end) {
            int mid = (start + end) / 2;
            if (nums[mid] == target) {
                System.out.println(mid);
                break;
            } else if (nums[mid] < target) start = mid + 1;
            else end = mid - 1;
        }

    }
}
