package Striver.Arrays.Easy;
import java.util.Arrays;
// left rotate the array position by one - last is added at the first
public class RotateArrayByOne {
    public static int [] roatateOne(int [] a){
        int temp = a[0];
        for(int i =1 ;i < a.length; i++ ){
            a[i-1] = a[i];
        }
        a[a.length - 1] = temp;
        return a;
    }
    static void main() {
        int [] a = {5,1,2,3,4};
        System.out.println(Arrays.toString(roatateOne(a)));
    }
}
