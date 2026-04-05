import java.util.*;
/*public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        int start = 0;
        int end = arr.length - 1;

        while(start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }

        System.out.println(Arrays.toString(arr));
    }
}*/

public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array");
        int  n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("enter array elements");
        for(int i =0; i<n; i++){
        arr[i] = sc.nextInt();
        }
        int start = 0;
        int end = n-1;
        while(start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }

      System.out.println(Arrays.toString(arr));

    }
}
