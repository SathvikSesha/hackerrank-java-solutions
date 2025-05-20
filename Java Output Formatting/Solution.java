import java.util.Scanner;

class Solution {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("================================");

        for (int i = 0; i < 3; i++) {
            String s = sc.next();
            int n = sc.nextInt();
            int l = 15 - s.length();

            System.out.printf("%s%s%03d\n", s, " ".repeat(l), n);
        }
        System.out.println("================================");
    }
}
