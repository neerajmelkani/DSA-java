import java.util.*;
public class MajorityCharacterinString {

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            String str = sc.next();

            HashMap<Character, Integer> map = new HashMap<>();

            for(char c : str.toCharArray()) {

                map.put(c, map.getOrDefault(c, 0) + 1);
            }

            for(char key : map.keySet()) {

                if(map.get(key) > str.length() / 2) {
                    System.out.println(key);
                    return;
                }
            }

            System.out.println("No Majority Character");
        }

}
