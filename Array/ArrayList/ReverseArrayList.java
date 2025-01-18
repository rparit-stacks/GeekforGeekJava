package Array.ArrayList;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;

public class ReverseArrayList {
    ReverseArrayList(ArrayList<Integer>nums){
        int i = 0, j = nums.size()-1;
        while(i < j){
            Integer temp = nums.get(i);
            nums.set(i++,nums.get(j));
            nums.set(j--,temp);
        }
    }
}
