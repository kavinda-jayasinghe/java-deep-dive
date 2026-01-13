package leetcode;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LongestSub {



    public static void main(String[] args) {

        longestSub("helyil");

    }

   static void longestSub(String word){

        Map<Character,Integer> map=new LinkedHashMap<>();
        char[] letters=word.toCharArray();

        for(int i=0;i<letters.length;i++){
            map.put(letters[i],map.getOrDefault(letters[i],0)+1);
            if(map.get(letters[i])>=2){
                break;
            }
       }

       StringBuilder result = new StringBuilder();
       for (Character key : map.keySet()) {
           result.append(key);
       }
       System.out.println(result);

   }
}
