import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Arrays of primitives
int [] age = new int[10];
//NORMAL INPUTING
//age [0]=45;
        Scanner in = new Scanner(System.in);
        for(int i=0;i< age.length;i++){

            age[i]= in.nextInt();
        }
        for(int i=0;i<age.length;i++){
            System.out.println(age[i]);

            //OR
//        for (int j : age) {
//            System.out.println(j);
        }
        // Another way to print
        System.out.println(Arrays.toString(age));





    }
}