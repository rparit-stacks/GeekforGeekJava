package Array.ArrayList;


import java.util.ArrayList;


import java.util.Arrays;
import java.util.List;

public class test {
    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        new kLargestNumber(new ArrayList<>(Arrays.asList(4, 5, 6, 7, 8,3,4,2,4,2,42,4,3,4,2,4,3,4,2,4,2,3,2,4,3,4,3)), 8);
        new RemoveEvenNumber(new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,6,5,4,7,51,2,5,4,8)));
        new ReverseArrayList(nums);
        new MergeArrayList(new ArrayList<>(Arrays.asList(1,2,5,4,7,8,9)),new ArrayList<>(Arrays.asList(4,547,9)));
        System.out.println(nums);
    }
}
