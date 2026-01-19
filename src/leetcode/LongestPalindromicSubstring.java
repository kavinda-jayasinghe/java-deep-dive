package leetcode;

/*
Input: s = "babad"
Output: "bab"
Explanation: "aba" is also a valid answer.
*/

public class LongestPalindromicSubstring {
    public static void main(String[] args) {
        System.out.println(longestPalindromicSubstring("aba"));
    }

    static boolean longestPalindromicSubstring(String word) {
        return isPalindrome(word);
    }

    static boolean isPalindrome(String word) {
        int left = 0;
        int right = word.length() - 1;

        while (left < right) {
            if (word.charAt(left) != word.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}