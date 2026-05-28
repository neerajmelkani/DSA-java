import java.util.*;
public class DuplicateCharsInString {

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            String str = sc.next();

            HashSet<Character> set = new HashSet<>();
            HashSet<Character> duplicate = new HashSet<>();

            for(char c : str.toCharArray()) {

                if(set.contains(c)) {
                    duplicate.add(c);
                }

                set.add(c);
            }

            for(char c : duplicate) {
                System.out.print(c + " ");
            }
        }

}
