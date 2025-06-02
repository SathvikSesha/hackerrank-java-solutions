import java.util.Scanner;

public class Eleven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // Number of test cases

        for (int j = 0; j < n; j++) {
            int k = sc.nextInt(); // Number of permutations
            String str = "abcdefghijklm";
            char[] arr = str.toCharArray();
            boolean valid = true;

            for (int q = 1; q < k; q++) {
                int index = -1;

                // Step 1: Find the index where arr[i] < arr[i + 1]
                for (int i = arr.length - 2; i >= 0; i--) {
                    if (arr[i] < arr[i + 1]) {
                        index = i;
                        break;
                    }
                }

                // No more permutations possible
                if (index == -1) {
                    valid = false;
                    break;
                }

                // Step 2: Find the smallest character greater than arr[index]
                int smallest = index + 1;
                for (int i = index + 1; i < arr.length; i++) {
                    if (arr[i] > arr[index] && arr[i] <= arr[smallest]) {
                        smallest = i;
                    }
                }

                // Step 3: Swap
                char temp = arr[index];
                arr[index] = arr[smallest];
                arr[smallest] = temp;

                // Step 4: Reverse suffix
                int left = index + 1, right = arr.length - 1;
                while (left < right) {
                    char t = arr[left];
                    arr[left] = arr[right];
                    arr[right] = t;
                    left++;
                    right--;
                }
            }

            if (valid) {
                System.out.println(new String(arr));
            } else {
                System.out.println("No more permutations possible.");
            }
        }
        sc.close();
    }
}
