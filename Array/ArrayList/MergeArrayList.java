package Array.ArrayList;

import java.util.ArrayList;

public class MergeArrayList {

    MergeArrayList(ArrayList<Integer>nums1, ArrayList<Integer>nums2){
            nums1.addAll(new ArrayList<>(nums2));
        System.out.println(nums1);

    }
}
