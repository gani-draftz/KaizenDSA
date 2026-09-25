package Striver.Patterns;

import java.util.Scanner;
//printing a right angle triangle in a reverse order
public class Pattern5 {
    static void pat5(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i; j < 5; j++) {
                System.out.print( "* ");
            }
            System.out.println();
        }
    }

    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number for the right angle Triangle :");
        int n = sc.nextInt();
        pat5(n);
    }
}
