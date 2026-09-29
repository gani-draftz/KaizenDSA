package Striver.Arrays.Easy;
// max-conecutive ones in an array
//leetcode-485
public class MaxConsecutiveOnes {
    public static int maxOnes(int [] a ){
        int count = 0 , max = 0;
        for (int i = 0 ; i < a.length; i++){
            if(a[i] == 1){
                count ++;
                if(count > max){
                    max = count;
                }
            }
            else{
                count = 0;
            }
        }
        return max;
    }
    static void main() {
        int [] arr = {1,1,0,1,1,1,1};
        System.out.println(maxOnes(arr));
    }
}
