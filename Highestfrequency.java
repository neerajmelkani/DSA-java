import java.util.*;
public class Highestfrequency {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            String str = sc.next();

            HashMap<Character, Integer> map = new HashMap<>();

            for(char c : str.toCharArray()) {

                map.put(c, map.getOrDefault(c, 0) + 1);
            }

            char maxChar = ' ';
            int maxFreq = 0;

            for(char key : map.keySet()) {

                if(map.get(key) > maxFreq) {

                    maxFreq = map.get(key);
                    maxChar = key;
                }
            }

            System.out.println("Highest Frequency Character: " + maxChar);
        }
    }
