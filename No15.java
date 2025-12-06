import java.util.Scanner;

public class No15
 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter number " + (i+1) + ": ");
            arr[i] = sc.nextInt();
        }

        System.out.println("Numbers greater than 50:");
        boolean any = false;
        for (int i = 0; i < 5; i++) {
            if (arr[i] > 50) {
                System.out.println(arr[i]);
                any = true;
            }
        }
        if (!any) {
            System.out.println("None");
        }
    }
}
