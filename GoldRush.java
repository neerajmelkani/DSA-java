import java.util.*;
public class GoldRush {
    public static boolean canObtain(long n, long m) {
        if (n == m) return true;
        if (n < m || n % 3 != 0) return false;
        return canObtain(n / 3, m) || canObtain((2 * n) / 3, m);
    }
    
    public static void main(String[] args) {    
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();  
        while (t-- > 0) {
            long n = sc.nextLong();
            long m = sc.nextLong();
            if (canObtain(n, m)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}