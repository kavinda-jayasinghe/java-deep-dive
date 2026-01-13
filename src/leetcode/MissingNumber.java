package leetcode;

public class MissingNumber {
    public static void main(String[] args) {
        int[]  numbers={1, 2, 4, 5};
        missingNumber(numbers);

    }
    static void missingNumber(int[] numbers){
        int expectedSum=0;
        int actualSum=0;

        for(int n:numbers){
            actualSum+=n;
        }
        System.out.println("actualSum"+actualSum);
        for (int n=1;n<=numbers.length+1;n++){
            expectedSum+=n;
        }
        System.out.println("expectedSum"+expectedSum);
        int missingNum=expectedSum-actualSum;
        System.out.println(missingNum);

    }
}

