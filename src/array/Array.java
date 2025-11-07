package array;


public class Array {

    class RemoveDuplicate{
        //remove duplicate element in the array
        public static void main(String[] args) {
            int[] arr={1,2,4,4,6,6,6};
            int prev=arr[0];

            for(int i=1;i<arr.length;i++){
                if(arr[i]!=prev){
                    System.out.print(prev);
                    prev=arr[i];
                }
            }
        }
    }
}
class MissingElement{

    //1+2+3
    public static void main(String[] args) {
        int[] arr={8, 2, 4, 5, 3, 7, 1}; //6
        int length=arr.length;
        int sum=0;
        int missingElement = 0;

        //expected sum
        int expectedSum=totalSum(length);

        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
            missingElement=expectedSum-sum;
        }
        System.out.println("missingElement :"+missingElement);

    }
    static int totalSum(int length){
        //cal total sum
        int sum=0;
        for(int i=1;i<=length+1;i++){
            sum=sum+i;
        }
        return sum;
    }

}

class D{
    public static void main(String[] args) {
        int n=5;
        for(int i=0;i<=n;i++){
            for(int j=i;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

class validPalindrome{
    public static void main(String[] args) {
        String name="aab,cbaa";

        String newName= name.toLowerCase().replaceAll("[^a-z]","");
        System.out.println(isPalindrome(newName));

    }
    public static boolean isPalindrome(String name){

        int left=0;
        int right=name.length()-1;

        while(left<=right){
            if(name.charAt(left)==name.charAt(right)){
                right--;
                left++;
            }else {
                return false;
            }

        }
        return true;
    }
}


class reverse{
    public static void main(String[] args) {
        int[] arr={2,3,4,5,1,4,6,1};
        int[] reversed=method(arr);
        for (Integer a:reversed){
            System.out.print(a+" ");
        }
    }
    static int[] method(int[] arr){
        int left=0;
        int right=arr.length-1;

        while (left<=right){
            int temp=arr[right];
            arr[right]=arr[left];
            arr[left]=temp;
            right--;
            left++;
        }
        return arr;
    }
}