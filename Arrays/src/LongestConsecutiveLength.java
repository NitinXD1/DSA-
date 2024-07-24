import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveLength {
    public static void main(String[] args) {
        int[] age = {102,4,100,1,101,3,2,1,1};
        System.out.println(longestConsecutive(age));
    }

    public static int longestConsecutive(int[] nums) {
        Set<Integer> age = new HashSet<>();
        for (int i = 0; i < nums.length ; i++) {
            age.add(nums[i]);
        }
        int maxLength = 0;
        for (int num : nums) {
            if(!age.contains(num-1)){


                int count = 1;
                int x = num;


                while(age.contains(x+1)){
                    count = count+1 ;
                    x = x+1;
                }
                maxLength = Math.max(count,maxLength);
            }
        }
        return maxLength;
    }
}
