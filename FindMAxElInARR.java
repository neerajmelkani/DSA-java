import java.util.Scanner;
public class FindMAxElInARR {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // pehle array ka size batata hai 
        System.out.println("enter the size of array");
        int n  = sc.nextInt();
        int[] arr = new int[n];
       // int[] arr = {n};
       if( n == 0){
        System.out.println("array is empty");
        return;
       }

        // uske baad array ke elements batane hai ;;;;

        System.out.println("enter array elements sir");
        for(int i =0; i< n; i++){
            arr[i] = sc.nextInt();
        }

           int max = arr[0];

          for(int i =1; i< n; i++){
            if(arr[i]  > max){

                max = arr[i];
            }
          }

        System.out.println(max);
    }
}