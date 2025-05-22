import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine().trim(); // Trim early

        if (s.length() == 0) {
            System.out.println(0);
        } else {
            String[] parts = s.split("[ ?,'._@!]+"); // Split on multiple delimiters
            System.out.println(parts.length);
            for (String str : parts) {
                System.out.println(str);
            }
        }
        scan.close();
    }
}
