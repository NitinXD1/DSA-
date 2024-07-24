import java.util.Arrays;

public class Passinginfunctions {
    public static void main(String[] args) {
        int[] No = {1,2,3,4,5,6};
        System.out.println(Arrays.toString(No));
        arr(No);
        System.out.println(Arrays.toString(No));
    }
    static void arr(int[] nums){
        nums  [0] = 99;

    }
}
