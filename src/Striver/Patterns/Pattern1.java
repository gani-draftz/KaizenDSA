package Striver.Patterns;

// just a sample program for working with nested loops and methods
import java.util.Scanner;
public class Pattern1 {

    static void patt(int n){
        for(int i = 0;i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.print("* ");
            }
            System.out.println( );
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number to form a pattern:");
        int n = sc.nextInt();
        patt(n);
    }
}