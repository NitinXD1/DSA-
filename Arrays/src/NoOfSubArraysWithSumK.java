import java.util.HashMap;

public class NoOfSubArraysWithSumK {
    public static void main(String[] args) {
        int[] arr = {3, 1, 2, 4};
        int k = 6;
        int cnt = subarraySum(arr, k);
        System.out.println("The number of subarrays is: " + cnt);
    }

    public static int subarraySum(int[] nums, int k) {

        int count = 0;
        int preSum = 0;
        HashMap<Integer,Integer> mpp = new HashMap<>();
        mpp.put(0,1);
        for (int i = 0; i < nums.length ; i++) {

            preSum += nums[i];

            int remove = preSum - k;

            count += mpp.getOrDefault(remove,0);

            mpp.put(preSum, mpp.getOrDefault(preSum,0)+1);

        }


        return count;
    }
}
