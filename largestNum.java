import java.util.Scanner;
public class largestNum {

    static int largestElement(int[] arr, int n) {
          // firstly assign 1st element as max
          // then after compare it with other elements of array
          int max = arr[0];
           for(int i = 1;i<n; i++){
               if(arr[i]> max){
                   max = arr[i];
               }
           }
           return max;
    }
          public static void main(String[] args){  
             Scanner sc = new Scanner(System.in);
                 // here n is size of array
               int n = sc.nextInt();
               int[] arr = new int[n];
        // input array elements
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int ans = largestElement(arr , n);
          
        System.out.println(ans);
    }
}
