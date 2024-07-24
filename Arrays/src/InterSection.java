import java.util.ArrayList;

public class InterSection {
    public static void main(String[] args) {

        int [] a1 = {1,1,2,3,5,6,7};
        int [] a2 = {1,2,3,6,7};

        System.out.println(findUnion(a2,a1,5,7));

    }
    static ArrayList<Integer> findUnion(int arr1[], int arr2[], int n, int m)
    {
        int i = 0;
        int j = 0;
        ArrayList<Integer> intersection = new ArrayList<>();
        while(i<n &&  j<m){
            if(arr1[i]<arr2[j]){
                i++;
            }
            if(arr2[j]<arr1[i]){
                j++;
            }
            if(arr1[i] == arr2[j]){
                intersection.add(arr1[i]);
                i++;
                j++;
            }
        }
        return intersection;
    }
}
