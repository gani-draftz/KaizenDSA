package Striver.Patterns;

import java.util.Scanner;

// right angle triangle prog
public class Pattern2 {
    static void pat2(int n){
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number for the right angle Triangle :");
        int n =sc.nextInt();
        pat2(n);
    }
}
