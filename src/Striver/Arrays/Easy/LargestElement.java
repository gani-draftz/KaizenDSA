package Striver.Arrays.Easy;
// largest elament in an array
public class LargestElement {
    public static int largestElement(int[] nums) {
        int l = nums[0];
        for(int i = 1; i< nums.length ; i++){
            if(nums[i] > l){
                l = nums[i];
            }
        }
        return l;
    }

    static void main() {
        int [] arr = {3,2,5,1,8,9};
        System.out.println(largestElement(arr));

    }
}
