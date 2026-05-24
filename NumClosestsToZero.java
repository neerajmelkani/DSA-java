import java.util.*;
public class NumClosestsToZero {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            int n = sc.nextInt();

            int closest = Integer.MAX_VALUE;

            for(int i = 0; i < n; i++) {

                int num = sc.nextInt();

                if(Math.abs(num) < Math.abs(closest)) {
                    closest = num;
                }
            }

            System.out.println(closest);
        }
    }

