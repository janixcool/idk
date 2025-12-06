import java.util.*;
public class No9
{
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        int sum = 0, num;

        while (true) {
            System.out.print("Enter number (0 to stop): ");
            num = sc.nextInt();

            if (num == 0) break;

            sum += num;
        }

        System.out.println("Sum = " + sum);

    }
}