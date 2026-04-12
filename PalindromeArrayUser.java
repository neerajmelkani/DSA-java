import java.util.*;
/*public class PalindromeArray {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 2, 1};

        int start = 0;
        int end = arr.length - 1;

        boolean isPalindrome = true;

        while(start < end){
            if(arr[start] != arr[end]){
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        System.out.println(isPalindrome);
    }
}
*/



public class PalindromeArrayUser {
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

        int start = 0;
        int end = n - 1;

        boolean isPalindrome = true;

        while(start < end){
            if(arr[start] != arr[end]){
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        System.out.println(isPalindrome);
    }
}
