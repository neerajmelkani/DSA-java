import java.util.*;
public class LongestIncreasingConsecutiveSequence {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            int n = sc.nextInt();

            int[] arr = new int[n];

            for(int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            int maxLen = 1;
            int current = 1;

            for(int i = 1; i < n; i++) {

                if(arr[i] == arr[i - 1] + 1) {
                    current++;
                    maxLen = Math.max(maxLen, current);
                }
                else {
                    current = 1;
                }
            }

            System.out.println(maxLen);
        }
    }

