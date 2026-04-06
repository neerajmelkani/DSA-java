/*public class SortedCheck {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        boolean isSorted = true;

        for(int i = 0; i < arr.length - 1; i++) {
            if(arr[i] > arr[i + 1]) {
                isSorted = false;
                break;
            }
        }

        System.out.println(isSorted);
    }
}*/

import java.util.Scanner;
class SortedCheck{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter array size");
        int n =sc.nextInt();
        int[] arr = new int[n];
         
        System.out.println("enter arr elements");
        for(int i =0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        boolean isSorted = true;
         for(int i = 0; i < arr.length - 1; i++) {
            if(arr[i] > arr[i + 1]) {
                isSorted = false;
                break;
            }
        }
       System.out.println(isSorted); 

    }
}
