import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            i++;
            System.out.println(i + " " + line);
        }
        sc.close();
    }
}
