import java.util.*;
public class MirrorString {

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            String s1 = sc.next();
            String s2 = sc.next();

            String reverse = "";

            for(int i = s1.length() - 1; i >= 0; i--) {
                reverse += s1.charAt(i);
            }

            if(reverse.equals(s2)) {
                System.out.println("Mirror Strings");
            }
            else {
                System.out.println("Not Mirror");
            }
        }
    }

