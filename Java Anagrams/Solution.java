import java.util.Scanner;

public class Solution {
    public static String Sorted(String str) {
        char charArray[] = str.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            for (int j = 0; j < charArray.length - i; j++)
                if (charArray[j] > charArray[j + 1]) {
                    char temp = charArray[j];
                    charArray[j] = charArray[j + 1];
                    charArray[j + 1] = temp;
                }
        }
        return String.valueOf(charArray);
    }

    static boolean isAnagram(String A, String B) {
        if (Sorted(A.toLowerCase()).equals(Sorted(B.toLowerCase()))) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");
    }
}
