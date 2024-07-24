
public class MaxItem {
    public static void main(String[] args) {
    int[] arr={1,4,74,644,35};
        System.out.println(max(arr,0,2));
    }
/**
 * static int max(int[] ARR){
 * int max = ARR[0];
 * for (int i = 1; i <ARR.length;i++) {
 * if (ARR[i]>max){
 * max = ARR[i];
 * }
 * }
 * return max;
 * }
 * // FOR RANGE SEARCHING
 */
static int max(int[] ARR, int a , int b){
        int max = ARR[a];
        for (int i = 1; i <=b;i++) {
            if (ARR[i]>max){

                max = ARR[i];

            }
        }
        return max;
    }
}
