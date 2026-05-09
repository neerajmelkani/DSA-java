import java.util.*;

public class LargestWordInsentence {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        sc.nextLine();
        String str = sc.nextLine();

        String[] words = str.split(" ");

        String largest = "";

        for(String word : words) {
            if(word.length() > largest.length()) {
                largest = word;
            }
        }

        System.out.println("Largest Word: " + largest);
    }
}