public class KadaneAlgo {

    public static void main(String[] args) {

        int [] age = {-2,-3,4,-1,-2,1,5,-3};
        System.out.println(maxSubArray(age));
    }
    public static int maxSubArray(int[] nums) {
        int Max = nums[0];
        int sum = 0;
        int startAns = -1;
        int endAns = -1;
        for (int i = 0; i <nums.length ; i++) {
            int start = 0;
            if(sum == 0){
                start = i;
            }
            sum += nums[i];
            if(sum>Max){
                Max = sum;
                startAns = start;
                endAns = i;
            }

            if(sum<0){
                sum = 0;
            }
        }
        return Max;
    }
}
