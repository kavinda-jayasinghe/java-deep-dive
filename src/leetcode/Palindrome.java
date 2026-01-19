package leetcode;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(palindrome("ABAT"));
    }
    static Boolean palindrome(String word){
        int left=0;
        char[] arr=word.toCharArray();
        int right =arr.length-1;

        while(left<right){
            if(arr[right]!=arr[left]){
                return false;
            }
            right--;
            left++;
        }
        return true;
    }

}
