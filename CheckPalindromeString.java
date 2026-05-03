import java.util.*;

public class CheckPalindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next().toLowerCase();

        int left = 0, right = str.length() - 1;
        boolean isPalindrome = true;

        while(left < right) {
            if(str.charAt(left) != str.charAt(right)) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }

        System.out.println(isPalindrome ? "Palindrome" : "Not Palindrome");
    }
}