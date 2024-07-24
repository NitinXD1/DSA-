import java.security.Key;
import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public static void main(String[] args) {
        int [] arr = {2,2,3,3,1,2,2};
        System.out.println(majorityElement(arr));
    }

    //Optimised Code Moore's Voting Algorithm
    public static int majorityElement(int[] nums){
        int element = 0;
        int count = 0;

        for (int i = 0; i < nums.length ; i++) {
            if (count == 0) {
                element = nums[i];
                count = 1;
            } else if (nums[i] == element) {
                count++;
            } else {
                count--;
            }
        }
        int count1 = 0;
        for (int i = 0; i <nums.length ; i++) {
            if(nums[i]== element) {
                count1++;
            }
        }
        if(count1>nums.length/2){
            return element;
        }   
        return -1;

    }






    //Better Code
//    public static int majorityElement(int[] nums) {
//        int n = nums.length;
//        Map<Integer,Integer> mpp = new HashMap<>();
//        for (int i = 0; i < nums.length; i++) {
//            mpp.put(nums[i], mpp.getOrDefault(nums[i], 0) + 1);
//
//            if (mpp.get(nums[i]) > (n / 2)) {
//                return nums[i];
//            }
//        }
//        return -1;
//    }
}
