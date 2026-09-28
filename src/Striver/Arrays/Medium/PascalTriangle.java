package Striver.Arrays.Medium;
//pascal Traingle
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PascalTriangle {
        public static List<List<Integer>> pascal1(int numRows) {
            List<List<Integer>> res = new ArrayList<>();
            List<Integer> R1 = new ArrayList<>();
            R1.add(1);
            res.add(R1);
            for (int i = 1; i< numRows; i++){ // outer loop
                List<Integer> temp = new ArrayList<>();
                temp.add(1);// starting element in every row
                //core logic
                for (int j = 1; j < i; j++){
                    int val = res.get(i-1).get(j)+res.get(i-1).get(j-1);
                    temp.add(val);
                }
                temp.add(1);//ending element in every row
                res.add(temp);
            }
            return res;
    }
    public static List<Integer> pascal2(int n) {
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    row.add(1);
                } else {
                    int val = res.get(i - 1).get(j - 1) + res.get(i - 1).get(j);
                    row.add(val);
                }
            }
            res.add(row);
        }
        return res.get(n);
    }
    static void main() {
        System.out.println(pascal1(5));
        System.out.println(pascal2(3));
    }
}