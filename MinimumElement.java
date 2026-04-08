/*public class MinimumElement {
    public static void main(String[] args) {
        int[] arr = {3,5,4,6,7};
        int min = arr[0];
        for(int i = 0; i<arr.length; i++){
            if(arr[0]< min){
                arr[0] = min;
            }
        }
        System.out.println(min);
    }
}*/

import java.util.Scanner;
public class MinimumElement {
    public static void main(String[] args) {
      
         Scanner sc = new Scanner(System.in);
         System.out.println("enter size of array");
         int n = sc.nextInt();
         int[] arr = new int[n];


        for(int i =0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int min = arr[0];
 for(int i = 0; i<arr.length; i++){
            if(arr[0]< min){
                arr[0] = min;
            }
        }
        System.out.println(min);
        

    }}


