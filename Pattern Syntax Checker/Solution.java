import java.util.regex.*;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            try {
                Pattern.compile(sc.nextLine());
            } catch (Exception e) {
                System.out.println("Invalid");
                continue;
            }
            System.out.println("Valid");
        }
        sc.close();
    }
}
