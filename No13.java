import java.util.Scanner;

public class No13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many students? ");
        int n = sc.nextInt();

        int pass = 0;
        int fail = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Enter grade for student " + (i+1) + " (0-100): ");
            int grade = sc.nextInt();
            if (grade >= 75) {
                pass++;
            }else {
                fail++;
            }
        }

        System.out.println("Results:");
        System.out.println("Passed: " + pass);
        System.out.println("Failed: " + fail);

        sc.close();
    }
}
