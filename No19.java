import java.util.Scanner;

public class No19{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many students? ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] names = new String[n];
        int[] grades = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter name of student " + (i+1) + ": ");
            names[i] = sc.nextLine();
            System.out.print("Enter grade of " + names[i] + ": ");
            grades[i] = sc.nextInt();
            sc.nextLine();
        }

        System.out.println("\nStudents and their grades:");
        for (int i = 0; i < n; i++) {
            System.out.println(names[i] + " - " + grades[i]);
        }

        sc.close();
    }
}
