import java.util.*;

//BRUTE
public class UnionOfTwoArrays {
    public static void main(String[] args) {


        int [] arr1 = {1,1,2,3,4,5};
        int [] arr2 = {2,3,4,4,5,6};

        union(arr1,arr2);

    }

    static void union(int[] a1,int[] a2){
        Set<Integer> set = new HashSet<>();
        List<Integer> done = new ArrayList<>();
        int index = 0;
        for (int i = 0; i <a1.length ; i++) {
            set.add(a1[i]);
        }
        for (int i = 0; i <a2.length ; i++) {
            set.add(a2[i]);
        }

        for (int elemnent:
             set)
            done.add(elemnent);
        System.out.println(done);
    }
}
