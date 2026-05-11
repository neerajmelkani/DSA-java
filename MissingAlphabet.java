import java.util.*;

public class MissingAlphabet {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.next().toLowerCase();

        boolean[] present = new boolean[26];

        for(char c : str.toCharArray()) {
            if(c >= 'a' && c <= 'z') {
                present[c - 'a'] = true;
            }
        }

        System.out.print("Missing: ");

        for(int i = 0; i < 26; i++) {
            if(!present[i]) {
                System.out.print((char)(i + 'a'));
            }
        }
    }
}
