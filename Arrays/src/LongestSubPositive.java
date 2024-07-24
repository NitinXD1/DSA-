public class LongestSubPositive {

    public static void main(String[] args) {
        int[] arr = {1,2,3,1,1,1,1,3,3};
        System.out.println(lenOfLongSubarr(arr,arr.length,3));
    }
    public static int lenOfLongSubarr (int A[], int N, int K) {

        int sum = A[0];
        int len = 0;
        int i = 0;
        int j = 0;
        while(j<N){

            while(i<=j && sum>K){
                sum -=  A[i];
                i++;
            }

            if(sum==K){
                len = Math.max(len,j-i+1);
            }

            j++;
            if(j<N) sum  += A[j];

        }
        return len;
    }
}
