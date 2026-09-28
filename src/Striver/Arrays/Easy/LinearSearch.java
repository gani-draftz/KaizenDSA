package Striver.Arrays.Easy;

public class LinearSearch {
    public static int linear(int [] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
    static void main() {
        int [] arr = {3,5,8,4,9} ;
        int target = 8;
        System.out.println(linear(arr,target));
        }
}
