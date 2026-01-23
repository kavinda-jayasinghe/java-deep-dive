package map;

import java.util.HashMap;
import java.util.Map;

public class Demo {
    public static void main(String[] args) {
//        String word="hello";
        method();
    }

    static void method(){

        String[] letters={"BMW","MITSUBISHI","BENZ","ALTO","KWID"};
        Map<String,Integer> map=new HashMap<>();

        for (String letter:letters){
            map.put(letter,map.getOrDefault(letter,0)+1);
        }
        for (Map.Entry<String,Integer> entry : map.entrySet()){
            entry.getKey();
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }
}
