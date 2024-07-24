import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {
        int[] arr = {1,23,4,24,2,3};
        swap(arr,1,2);

        System.out.println(Arrays.toString(arr));
    }

    static void swap (int[] AR, int index1, int index2){
        int temp = AR[index1];
        AR[index1] = AR[index2];
        AR[index2] = temp;
    }


}
