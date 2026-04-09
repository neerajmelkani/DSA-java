import java.util.*;

/*public class LeftRotate {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};

        int first = arr[0];

        for(int i = 0; i < arr.length - 1; i++){
            arr[i] = arr[i + 1];
        }

        arr[arr.length - 1] = first;

        System.out.println(Arrays.toString(arr));
    }
}*/

public class LeftRotate {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];


    for(int i = 0; i<n; i++){
        arr[i] = sc.nextInt();
    }
    int first = arr[0];
     for(int i = 0; i < arr.length - 1; i++){
            arr[i] = arr[i + 1];
        }

        arr[arr.length - 1] = first;

        System.out.println(Arrays.toString(arr));
    }   
}