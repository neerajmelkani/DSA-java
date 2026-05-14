import java.util.*;

public class MaximumConsecutive1s {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int n = sc.nextInt();

            int[] arr = new int[n];

            for(int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            int count = 0;
            int maxCount = 0;

            for(int num : arr) {

                if(num == 1) {
                    count++;
                    maxCount = Math.max(maxCount, count);
                } else {
                    count = 0;
                }
            }

            System.out.println("Maximum Consecutive 1s: " + maxCount);
        }
    }