import java.util.*;

public class Vowels_Consonent {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.next().toLowerCase();

        int vowels = 0, consonants = 0;

        for(char c : str.toCharArray()) {

            if(c >= 'a' && c <= 'z') {

                if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }

        System.out.println("Vowels = " + vowels);
        System.out.println("Consonants = " + consonants);
    }
}
