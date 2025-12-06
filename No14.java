import java.util.Scanner;

public class No14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many elements? ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + i + ": ");
            arr[i] = sc.nextInt();
        }

        System.out.println("Array in reverse:");
        for (int i = n - 1; i >= 0; i--) {
            System.out.println(arr[i]);
        }

        sc.close();
    }
}
