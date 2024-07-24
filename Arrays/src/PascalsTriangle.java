import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
    public static void main(String[] args) {
        System.out.println(generate(5));
    }

    //Returns whole triangle
    static List<List<Integer>> generate(int numRows) {

        List<List<Integer>> pascals = new ArrayList<>();
        for (int rows = 1; rows <=numRows ; rows++) {
            pascals.add(row(rows));
        }
        return pascals;
    }

    //Returns A Row
    static List<Integer> row (int row){
        int ans = 1;
        List<Integer> temp = new ArrayList<>();
        temp.add(ans);
        for (int col = 1; col < row ; col++) {
            ans = ans*(row-col);
            ans = ans/col;
            temp.add(ans);
        }
        return temp;
    }
}
