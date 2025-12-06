import java.util.Scanner;

public class No16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer (use positive or negative): ");
        long num = sc.nextLong();

        if (num == 0) {
            System.out.println("Number of digits: 1");
            sc.close();
            return;
        }

        num = Math.abs(num);
        int digits = 0;
        while (num != 0) {
            num /= 10;
            digits++;
        }

        System.out.println("Number of digits: " + digits);
        sc.close();
    }
}
