import java.util.*;
public class StringRotationOfAnother {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s1 = sc.next();
        String s2 = sc.next();

        if(s1.length() != s2.length()) {
            System.out.println("Not Rotation");
            return;
        }

        String temp = s1 + s1;

        if(temp.contains(s2)) {
            System.out.println("Rotation");
        } else {
            System.out.println("Not Rotation");
        }
    }
}
