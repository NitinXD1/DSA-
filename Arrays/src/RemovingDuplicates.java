public class RemovingDuplicates {
    public static void main(String[] args) {
        int [] arr = {1,1,2,2,2,3,3};
        System.out.println(removeDuplicates(arr));
    }

    static public int removeDuplicates(int[] nums) {
        int i=0;
            for (int j = 1; j < nums.length ; j++) {
                if(nums[i] != nums[j]){
                    nums[i+1] = nums[j];
                    i++;
                }

        }
            return i+1;
    }
}
