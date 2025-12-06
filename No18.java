import java.util.Scanner;

public class No18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many elements? ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + i + ": ");
            arr[i] = sc.nextInt();
        }

        boolean hasDuplicate = false;
        outer:
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    hasDuplicate = true;
                    System.out.println("Duplicate found: value " + arr[i] + " at indices " + i + " and " + j);
                    break outer;
                }
            }
        }

        if (!hasDuplicate) System.out.println("No duplicates found.");
        sc.close();
    }
}