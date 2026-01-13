package leetcode;

public class SecondLargest {
    public static void main(String[] args) {
        int[] numbers={1,4,2,5,6};
        secondLarge(numbers);
    }
    static void secondLarge(int[] numbers){
        int first=Integer.MIN_VALUE;
        int second=Integer.MIN_VALUE;

        for(int num:numbers){
            if(num>first){
                second=first;
                first=num;
            } else if (num>second && num!=first){
                second=num;
            }
        }
        System.out.println("second large : " +second);

    }
}