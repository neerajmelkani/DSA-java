import java.util.*;
public class MaxSumPair {
   
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            int n = sc.nextInt();

            int first = Integer.MIN_VALUE;
            int second = Integer.MIN_VALUE;

            for(int i = 0; i < n; i++) {

                int num = sc.nextInt();

                if(num > first) {
                    second = first;
                    first = num;
                }
                else if(num > second) {
                    second = num;
                }
            }

            System.out.println(first + second);
        }

}
