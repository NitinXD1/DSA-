import java.util.ArrayList;
import java.util.Collections;

public class LeadersInArray {

    public static void main(String[] args) {
        int [] age = {10,22,12,3,0,6};
        System.out.println(leaders(age.length,age));
    }
    static ArrayList<Integer> leaders(int n, int arr[]) {
        int max = Integer.MIN_VALUE;
        ArrayList<Integer> lead = new ArrayList<>();
        for (int i = n-1; i >= 0 ; i--) {
            if (arr[i] > max) {
                max = arr[i];
                lead.add(max);
            }
        }
        Collections.reverse(lead);
        return lead;
    }

}
