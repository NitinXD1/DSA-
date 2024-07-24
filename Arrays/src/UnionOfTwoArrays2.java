import java.util.ArrayList;
import java.util.List;

public class UnionOfTwoArrays2 {
    public static void main(String[] args) {

        int arr1 [] = {1,1,2,3,4,5,5};
        int arr2 [] = {2,2,3,3,4,5,6};

        System.out.println(union(arr1,arr2));
    }

    static List<Integer> union(int [] arr1,int [] arr2){

        List<Integer> Union = new ArrayList<>();

        int i = 0;
        int j = 0;
        int n1 = arr1.length;
        int n2 = arr2.length;

        while(i<n1 && j<n2){
            if(arr1 [i] <= arr2[j]){
                if(Union.size() ==0 || Union.get(Union.size()-1) != arr1[i]){
                    Union.add(arr1[i]);
                }
                i++;
            }
            else{
                if(Union.size() ==0 || Union.get(Union.size()-1) != arr2[j]){
                    Union.add(arr2[j]);
                }
                j++;
            }
        }

        while(j<n2){
            if(Union.size() ==0 || Union.get(Union.size()-1) != arr2[j]){
                Union.add(arr2[j]);
            }
            j++;
        }

        while(i<n1){
                if(Union.size() ==0 || Union.get(Union.size()-1) != arr1[i]){
                    Union.add(arr1[i]);
                }
                i++;
        }

        return Union;
    }
}
