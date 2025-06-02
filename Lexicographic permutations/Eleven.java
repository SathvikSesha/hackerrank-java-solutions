import java.util.*;

public class Eleven {
    static String getKthPermutation(String str, int k) {
        List<Character> chars = new ArrayList<>();
        for (char c : str.toCharArray()) {
            chars.add(c);
        }

        int n = chars.size();
        long[] factorial = new long[n + 1];
        factorial[0] = 1;

        for (int i = 1; i <= n; i++) {
            factorial[i] = factorial[i - 1] * i;
        }

        if (k > factorial[n]) {
            return "No more permutations possible.";
        }

        k--; // convert to 0-based index
        StringBuilder result = new StringBuilder();

        for (int i = n; i > 0; i--) {
            int index = (int) (k / factorial[i - 1]);
            result.append(chars.get(index));
            chars.remove(index);
            k %= factorial[i - 1];
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // number of test cases

        for (int j = 0; j < t; j++) {
            int k = sc.nextInt(); // find the k-th permutation
            String str = "abcdefghijklm";
            System.out.println(getKthPermutation(str, k));
        }
    }
}
