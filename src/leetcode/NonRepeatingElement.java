package leetcode;

import java.util.HashMap;
import java.util.Map;

public class NonRepeatingElement {
    public static void main(String[] args) {
        int[] numbers={4, 5, 1, 2, 0, 5, 4,1};

        nonRepeatingElement(numbers);
    }
    static void nonRepeatingElement(int[] numbers){

        Map<Integer,Integer> map=new HashMap<>();
        for (int num:numbers){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for (Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue().equals(1)){
                System.out.println("non repeating elements : "+ entry.getKey());
            }
        }


    }
}
