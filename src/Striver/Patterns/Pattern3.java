package Striver.Patterns;

import java.util.Scanner;

public class Pattern3 {
    static void pat3(int n){
        for(int i = 1; i <= n; i++)
        {
            for(int j = 1; j <= i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number for the right angle Triangle :");
        int n =sc.nextInt();
        pat3(n);
    }
}
