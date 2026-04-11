/*public class CountEvenOdd {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6};

        int even = 0;
        int odd = 0;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 2 == 0){
                even++;
            } else {
                odd++;
            }
        }

        System.out.println("Even count: " + even);
        System.out.println("Odd count: " + odd);
    }
}*/

import java.util.*;

public class CountEvenOddUser {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        if(n == 0){
            System.out.println("Array is empty");
            return;
        }

        int[] arr = new int[n];

        System.out.println("Enter elements:");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int even = 0;
        int odd = 0;

        for(int i = 0; i < n; i++){
            if(arr[i] % 2 == 0){
                even++;
            } else {
                odd++;
            }
        }

        System.out.println("Even count: " + even);
        System.out.println("Odd count: " + odd);
    }
}
