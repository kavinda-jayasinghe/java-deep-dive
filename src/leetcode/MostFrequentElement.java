package leetcode;

import java.util.HashMap;
import java.util.Map;

public class MostFrequentElement {

    public static void main(String[] args) {
int[] numbers={1, 2, 3, 2, 4, 2,1,1,1};
mostFrequentElement(numbers);
    }

    static void mostFrequentElement(int[] numbers){
        Map<Integer,Integer> map=new HashMap<>();
        for(Integer num:numbers){
            map.put(num, map.getOrDefault(num,0)+1);
        }
        int maxCount=0;
        for(int n:map.values()){
            if(maxCount<n){
                maxCount=n;
            }
        }
        for (Map.Entry<Integer,Integer> entry : map.entrySet()){
           if(entry.getValue().equals(maxCount)){
               System.out.println("most : "+entry.getKey());
           }
        }

    }
}
