import java.util.Scanner;

public class Solution {

    public static String getSmallestAndLargest(String str, int n) {
        String smallest = str.substring(0, n);
        String largest = str.substring(0, n);

        for (int i = 1; i <= str.length() - n; i++) {
            String substr = str.substring(i, i + n);
            if (substr.compareTo(smallest) < 0) {
                smallest = substr;
            }
            if (substr.compareTo(largest) > 0) {
                largest = substr;
            }
        }

        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}