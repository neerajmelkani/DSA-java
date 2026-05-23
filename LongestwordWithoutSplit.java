import java.util.*;
public class LongestwordWithoutSplit {

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            sc.nextLine();
            String str = sc.nextLine();

            String word = "";
            String longest = "";

            for(int i = 0; i < str.length(); i++) {

                char c = str.charAt(i);

                if(c != ' ') {
                    word += c;
                }
                else {

                    if(word.length() > longest.length()) {
                        longest = word;
                    }

                    word = "";
                }
            }

            if(word.length() > longest.length()) {
                longest = word;
            }

            System.out.println(longest);
        }
    }

