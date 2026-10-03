package Striver.Basics;
// reverse a number
public class ReverseANumber {
    static int rev(int n){
        int rev = 0;
        while(n != 0){
            int ld = n % 10;
            // to add the edge cases the min and max values should not break and should not overflow
            if(rev < Integer.MIN_VALUE / 10 || (rev == Integer.MIN_VALUE /10 )&& ld < -8){
                return 0;
            }
            if(rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE /10 )&& ld > 7){
                return 0;
            }
            rev = rev*10 + ld;
            n = n / 10;
        }
        return rev;
    }
    static void main() {
        int num = - 65430;
        System.out.println(rev(num));
    }
}
