package leetcode;

public class ThirdLargest {
    public static void main(String[] args) {
        int[] numbers={1,2,3,5};
        thirdLargest(numbers);
    }
    static void thirdLargest(int[] numbers){

        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;


        for(int num:numbers) {
        if(num>first){
            third=second;
            second=first;
            first=num;
        } else if (num>second && num !=first) {
            third=second;
            second=num;
        } else if (num>third && num!=first && num!=second) {
            third=num;
        }

        }

        System.out.println("third largest number = "+third);

    }
}
