package Striver.Arrays.Easy;
// Rotating an array by k position
import java.util.Arrays;

// Rotate value by k
public class RotateArrayByK {
    public static int[] solution_bruteforce(int [] a , int k){
        k = k % a.length;//helps to do rotations within the 0 - arraysize
        int [] temp = new int[k];
        for (int i = 0; i < k; i++) {
            temp[i] = a[i];
        }
        for (int i = k; i < a.length; i++) {
            a[i - k] = a[ i ];
        }
/*       int j= 0; // SIMPLE WAY without any math
        for (int i = a.length - k; i <a.length; i++) {
            a[i]  = temp[j];
            j++;
        }*/
        for (int i = a.length - k; i < a.length; i++) {
         a[i] = temp[i - (a.length-k)];
        }
        return a;
    }
    public static int [] solution_optimal(int []a , int k){
        int n = a.length;
        k = k % n;
        reverse(a , 0, k-1);
        reverse(a, k, n-1);
        reverse(a,0,n-1);
        return a;
    }
    public static void reverse(int [] a , int start, int end) {
        while (start < end) {
            int temp = a[start];
            a[start] = a[end];
            a[end] = temp;
            start++;
            end--;
        }
    }

    static void main() {
        int [ ] arr = {1,2,3,4,5,6,7};
        System.out.println(Arrays.toString( solution_bruteforce(arr,9)));//BRUTEFORCE
        System.out.println(Arrays.toString( solution_optimal(arr,11)));//OPTIMAL
    }
}
