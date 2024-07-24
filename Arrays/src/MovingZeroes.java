import java.util.Arrays;

public class MovingZeroes {
    public static void main(String[] args) {

        int [] age = {1,0,2,3,2,0,0,4,5,1};
        moveZeroes(age);
        System.out.println(Arrays.toString(age));
    }

    static void moveZeroes(int[] nums) {
        int i = 0;
        if(nums[i]!=0){
            i++;
        }

        for (int j = i; j < nums.length ; j++) {
            if(nums[j]!=0){
                swap(nums,j,i);
                i++;
            }
        }
    }

    static void swap(int [] arr,int start,int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}
