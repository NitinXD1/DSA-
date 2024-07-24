import java.util.HashMap;
import java.util.Map;

public class LongestSubArrayPositiveNegative {
    public static void main(String[] args) {

    }

    static int longestSubArray(int [] arr,int k){
        Map<Integer,Integer> preSumMap = new HashMap<>() ;

        int sum = 0;
        int maxLen = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if(sum == k){
                maxLen = i+1;
            }
            int rem = (sum - k);
            if (preSumMap.containsKey(rem)) {
                int len = i - preSumMap.get(rem);
                maxLen = Math.max(maxLen, len);
            }

            if (!preSumMap.containsKey(sum)) {
                preSumMap.put(sum, i);
            }
        }


        return maxLen;
    }
}
