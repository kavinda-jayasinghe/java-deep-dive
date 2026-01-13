package leetcode;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class TwoSum {
    public static void main(String[] args) {
       int[] numbers={8, 7, 2, 5, 3, 1};
        twoSum(numbers,10);
    }
   static void twoSum(int[] numbers,int num) {
       Set<Integer> set=new HashSet<>();
        for(int n:numbers){
            int target=num-n;
            if(set.contains(target)){
                System.out.println("target elements are : " + n +" "+ target);
            }
            else{
                set.add(n);
            }
        }

   }
}
