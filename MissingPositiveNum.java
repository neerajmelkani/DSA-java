import java.util.*;
public class MissingPositiveNum {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            int n = sc.nextInt();

            int[] arr = new int[n];

            HashSet<Integer> set = new HashSet<>();

            for(int i = 0; i < n; i++) {

                arr[i] = sc.nextInt();

                if(arr[i] > 0) {
                    set.add(arr[i]);
                }
            }

            int missing = 1;

            while(true) {

                if(!set.contains(missing)) {
                    System.out.println("First Missing Positive: " + missing);
                    break;
                }

                missing++;
            }
        }
    }

