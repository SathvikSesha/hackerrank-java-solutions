import java.util.*;

public class Twentyeight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        List<String> originalStrings = new ArrayList<>();
        List<Double> numericValues = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String s = sc.nextLine();
            originalStrings.add(s);
            numericValues.add(Double.parseDouble(s));
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (numericValues.get(j) < numericValues.get(j + 1)) {
                    Collections.swap(numericValues, j, j + 1);
                    Collections.swap(originalStrings, j, j + 1);
                }
            }
        }

        for (String s : originalStrings) {
            System.out.println(s);
        }

        sc.close();
    }
}
