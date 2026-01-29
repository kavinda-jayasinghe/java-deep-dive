package leetcode;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstUniqueWord {
    public static void main(String[] args) {
        String[] words={"hello","world","this","is","test","map","hello","world"};
        firstUniqueCharacter(words);
    }

    static void firstUniqueCharacter(String[] words){
        Map<String,Integer> map=new LinkedHashMap<>();

        for (String word: words){
            map.put(word,map.getOrDefault(word,0)+1);
        }
        for (Map.Entry<String,Integer> entry : map.entrySet()){
            if (entry.getValue()>=2){
                System.out.println("first unique word is -> "+entry.getKey());
                break;
            }
        }
    }
}
