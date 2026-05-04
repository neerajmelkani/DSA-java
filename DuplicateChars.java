import java.util.*;
public class DuplicateChars {
    public class Main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            String str = sc.next();

            boolean[] seen = new boolean[256];
            String result = "";

            for (char c : str.toCharArray()) {
                if (!seen[c]) {
                    result += c;
                    seen[c] = true;
                }
            }

            System.out.println(result);
        }
    }
}
