package Striver.Basics;
// basic program on the loops and how the mo
public class CountDigitsInANumber {
    static int countDigits(int n){
        int count = 0;
        while (n > 0){
            n = n/10;
            count++;
        }
        return count;
    }
    static int countOddDigits(int n){
        int count = 0;
        while (n > 0){
            int lastdigit = n % 10;
            if(lastdigit % 2 != 0) {
                count++;
            }
            n = n/10;
        }
        return count;
    }
    static void main() {
        int num = 5340;
        System.out.println(countDigits(num));
        System.out.println(countOddDigits(num));
    }
}
