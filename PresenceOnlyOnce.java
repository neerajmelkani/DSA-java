import java.util.*;
public class PresenceOnlyOnce {

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            int n = sc.nextInt();

            HashMap<Integer, Integer> map = new HashMap<>();

            int[] arr = new int[n];

            for(int i = 0; i < n; i++) {

                arr[i] = sc.nextInt();

                map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
            }

            for(int num : arr) {

                if(map.get(num) == 1) {
                    System.out.print(num + " ");
                }
            }
        }

}
