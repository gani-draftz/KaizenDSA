class Solution {
    public boolean isPalindrome(int x) {
        int temp = x,rev = 0,last;
        while(x > 0 ){
            last = x % 10;
            rev = rev * 10 + last;
            x /= 10;
        }
        return rev == temp; 
    }
}