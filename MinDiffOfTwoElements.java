import java.util.*;
public class MinDiffOfTwoElements {

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            int n = sc.nextInt();

            int[] arr = new int[n];

            for(int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            Arrays.sort(arr);

            int minDiff = Integer.MAX_VALUE;

            for(int i = 0; i < n - 1; i++) {

                minDiff = Math.min(minDiff, arr[i + 1] - arr[i]);
            }

            System.out.println(minDiff);

    }
}
