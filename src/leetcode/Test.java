package leetcode;

public class Test {
    public static void main(String[] args) {
        System.out.println(palindrome("tTt"));
    }
    static boolean palindrome(String word){

        int left=0;
        int right=word.length()-1;
        while(left<right){
            if(word.charAt(left)!=word.charAt(right)){
                return false;
            }else {
                right--;
                left++;
            }
        }
        return true;
    }
}