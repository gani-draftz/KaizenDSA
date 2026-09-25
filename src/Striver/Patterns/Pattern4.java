package Striver.Patterns;
// right angle triangle with another pattern printing outer loop's number
import java.util.Scanner;

public class Pattern4 {
        static void pat4(int n){
            for(int i = 1; i <= n; i++)
            {
                for(int j = 1; j <= i; j++){
                    System.out.print(i+" ");
                }
                System.out.println();
            }
        }
        static void main() {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a number for the right angle Triangle :");
            int n =sc.nextInt();
            pat4(n);
        }
}
