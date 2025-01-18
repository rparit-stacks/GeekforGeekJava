package Array.ArrayList;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

 class kLargestNumber {

     kLargestNumber(@org.jetbrains.annotations.NotNull ArrayList<Integer>nums, Integer k){

         //bubble sort
         for(int i = 0; i < nums.size(); i++){
             for(int j = i+1; j< nums.size(); j++){
                 if(nums.get(i) > nums.get(j)){
                     Integer temp = nums.get(i);
                     nums.set(i,nums.get(j));
                     nums.set(j,temp);
                 }
             }
         }
         System.out.println(nums.get(nums.size()-k));

     }





}
