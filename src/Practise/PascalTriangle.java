package Practise;
//pascal Traingle
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Solution {
    public List<List<Integer>> generate(int numRows) {
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
}
public class PascalTriangle {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number of Rows for the Pascal Triangle :");
        int rows = sc.nextInt();
        Solution obj = new Solution();
        System.out.println(obj.generate(rows));
    }



}
