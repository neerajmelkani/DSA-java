import java.util.*;

public class FirstRepeated {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        HashSet<Character> set = new HashSet<>();

        for(char c : str.toCharArray()) {
            if(set.contains(c)) {
                System.out.println("First Repeated: " + c);
                return;
            }
            set.add(c);
        }

        System.out.println("No Repeated Character");
    }
}
