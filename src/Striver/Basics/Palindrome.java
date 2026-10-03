package Striver.Basics;
// palindrome of a number
public class Palindrome {
    static boolean palindrome(int n){
        int temp = n ,rev = 0;
        while(n > 0){
            int last = n % 10;
            rev = rev * 10 + last;
            n = n / 10;
        }
        return rev == temp;
    }

    static void main() {
        int n = 121;
        System.out.println(palindrome(n));
    }
}
