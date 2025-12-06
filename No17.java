import java.util.Scanner;

public class No17 {
         public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many elements (must be >=2)? ");
        int n = sc.nextInt();

        if (n < 2) {
            System.out.println("Need at least 2 elements.");
            sc.close();
            return;
        }

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i+1) + ": ");
            arr[i] = sc.nextInt();
        }

        int highest = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int val : arr) {
            if (val > highest) {
                second = highest;
                highest = val;
            } else if (val > second && val < highest) {
                second = val;
            }
        }

        if (second == Integer.MIN_VALUE) {
            System.out.println("There is no distinct second highest (all elements may be equal).");
        } else {
            System.out.println("Highest: " + highest);
            System.out.println("Second highest: " + second);
        }

        sc.close();
    }
}