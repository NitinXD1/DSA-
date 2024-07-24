import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class NextPermutation {
    public static void main(String[] args) {
        int [] age = {1,1,5};
        nextPermutation(age);
        System.out.println(Arrays.toString(age));
    }

    static void nextPermutation(int[] nums) {
        int index = -1;
        for (int i = nums.length-2; i >=0 ; i--) {
            if(nums[i]<nums[i+1]){
                index = i;
                break;
            }
        }

        if(index==-1){
            reverse(nums,0, nums.length-1);
            return;
        }

        for (int i= nums.length-1 ; i > index ; i--){
            if(nums[i]>nums[index]){
                swap(nums,index,i);
                break;
            }
        }

        reverse(nums,index+1,nums.length-1);
    }

    static void reverse(int[] arr, int start,int end){
        while(start<end){
            swap(arr,start,end);
            start++;
            end--;
        }
    }
    static void swap(int[] arr,int start,int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}
