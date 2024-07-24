import java.util.Arrays;

public class ReArrangeBySigns {
    public static void main(String[] args) {
        int [] age = {-1,1};

        int [] ans = rearrangeArray(age);

        System.out.println(Arrays.toString(ans));
    }
    public static int[] rearrangeArray(int[] nums) {
        int positive = 0;
        int negative = 1;
        int i = 0;
        int [] arr = new int[nums.length];
        while(negative<nums.length || positive< nums.length){
            if(nums[i]>0){
                arr[positive] = nums[i];
                i++;
                positive = positive+2;
            }
            else{
                arr[negative] = nums[i];
                i++;
                negative = negative+2;
            }
        }
        return arr;
    }
}
