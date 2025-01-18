package Array.ArrayList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.concurrent.CopyOnWriteArrayList;

public class RemoveEvenNumber {

    RemoveEvenNumber(ArrayList<Integer>nums){

        CopyOnWriteArrayList<Integer>nums2 = new CopyOnWriteArrayList<>(nums);
        for(int i = 0; i < nums2.size(); i++){
            if(nums2.get(i) % 2 == 0) nums2.remove(i);
        }

        System.out.println(nums2);
    }
}
