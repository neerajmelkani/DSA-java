/*public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40};
        int target = 30;

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == target) {
                System.out.println("Found at index: " + i);
                return;
            }
        }

        System.out.println("Not Found");
    }
}*/

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
     
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i =0; i<n; i++){
            arr[i] = sc.nextInt();
            
        }   
        int target = sc.nextInt();

        
        for(int i = 0; i < n; i++) {
            if(arr[i] == target) {
                System.out.println("Found at index: " + i);
                return;
            
        }
    }
        System.out.println("not found");

    }
}