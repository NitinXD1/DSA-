import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class TwoSum {

    public static void main(String[] args) {

        int arr [] ={2,6,5,8,11};
        twoSum(arr,14);
    }
    static int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> storage = new HashMap<>();
        int [] arr = new int[2];
        for (int i = 0; i <nums.length ; i++) {

            int req = target - nums[i];
            if(storage.containsKey(req)){
             arr[0] = i;
             arr[1] = storage.get(req);
            }
            storage.put(nums[i],i);

        }
        return arr;
    }
}
