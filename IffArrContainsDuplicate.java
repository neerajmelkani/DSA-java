import java.util.*;
public class IffArrContainsDuplicate {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int n = sc.nextInt();

            int[] arr = new int[n];

            HashSet<Integer> set = new HashSet<>();

            boolean found = false;

            for(int i = 0; i < n; i++) {

                arr[i] = sc.nextInt();

                if(set.contains(arr[i])) {
                    found = true;
                }

                set.add(arr[i]);
            }

            if(found) {
                System.out.println("Duplicate Found");
            } else {
                System.out.println("No Duplicate");
            }
        }
    }

