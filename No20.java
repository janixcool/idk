import java.util.Scanner;

public class No20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many numbers? ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter number " + (i+1) + ": ");
            arr[i] = sc.nextInt();
        }

        System.out.println("Even numbers greater than 20:");
        boolean any = false;
        for (int val : arr) {
            if (val > 20 && val % 2 == 0) {
                System.out.println(val);
                any = true;
            }
        }
        if (!any) {
            System.out.println("None found.");
        }

        sc.close();
    }
}
