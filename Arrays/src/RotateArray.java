import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {

        int [] nums = {1,2,3,4,5,6,7};
        int n=3;

        rotate(nums,n);
        System.out.println(Arrays.toString(nums));

    }

    static void rotate(int [] nums,int k){
        k=nums.length - k ;
        reverse(nums,0,k-1);
        reverse(nums,k,nums.length-1);
        reverse(nums,0,nums.length-1);
    }

    static void reverse(int[] nums,int start,int end){

        while(start <= end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start ++;
            end--;
        }

    }

    //brute Force
//    public static void rotate(int [] nums,int k){
//        int m = nums.length- k;
//        int [] temp = new int[m];
//        int n = nums.length;
//
//        for (int i = 0; i < m ; i++) {
//            temp[i] = nums[i];
//        }
//
//
//        for (int i = m; i < n ; i++) {
//            nums[i-m] = nums[i];
//        }
//
//        for (int i = n-m ; i < nums.length ; i++) {
//            nums[i] = temp[i-(n-m)];
//        }
//    }

    //Optimal Code

}
