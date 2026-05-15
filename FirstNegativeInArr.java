import java.util.*;
public class FirstNegativeInArr {

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            int n = sc.nextInt();

            int[] arr = new int[n];

            for(int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            for(int num : arr) {

                if(num < 0) {
                    System.out.println("First Negative: " + num);
                    return;
                }
            }

            System.out.println("No Negative Number");
        }
}
