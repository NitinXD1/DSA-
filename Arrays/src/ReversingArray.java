import java.util.Arrays;

public class ReversingArray {
    public static void main(String[] args) {
        int [] age = {3,4,2,34,24,42,4,24,54};
        Reverse(age,0,8);
        System.out.println(Arrays.toString(age));
    }

    static void Reverse (int[] arr,int a , int b){
        int temp = 0;

        for (int i =a; i <b; i++) {
           temp=arr[a];
           arr[a]=arr[b];
           arr[b]=temp;
           a++;
           b--;
        }
    }
}
