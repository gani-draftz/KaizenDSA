package Striver.Arrays.Easy;

import java.util.Arrays;
// to find second-largest element in an array
public class SecondLargest {
    public static int solution_bruteforce(int a[]){
        Arrays.sort(a);
        int last = a[a.length - 1 ];
        int slar = -1;
        for(int i = a.length - 2 ;i >= 0 ; i--){
            if( a[i] != last ) {
                slar = a[i];
                break;
            }
        }
        return slar;
    }
    public static int solution_better(int a[]){
        int lar = a[0];
        int slar = -1;
        for(int i= 1 ; i < a.length ; i++){
            if(a[i] > lar ){
                lar = a[i];
            }
        }
        for(int i= 0 ; i < a.length ; i++){
            if(a[i] > slar && a[i] != lar){
                slar = a[i];
            }
        }
        return slar;
    }
    public static int solution_optimal(int a[] ){
        int largest = a[0];
        int sLargest = -1;
        for(int i = 1; i < a.length ; i++){
            if(a[i] > largest){
                sLargest = largest;
                largest = a[i];
            } else if (a[i] < largest && a[i] > sLargest) {
                sLargest = a[i];
            }
        }
        return sLargest;
    }

    static void main() {
        int []arr=  {1,2,4,7,7,5};
//        int []arr2=  {1,1,1,1,1};
        System.out.println(solution_bruteforce(arr));
        System.out.println(solution_better(arr));
        System.out.println(solution_optimal(arr));
    }
}
