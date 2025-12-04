import java.util.*;
public class No1
{
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        while(true){
            System.out.print("Enter a number 1-100: ");
            int number=input.nextInt();
            if (number >= 1 && number <= 100) {
                System.out.print("Valid number!");
                 break;
            } else{ 
                System.out.println("Invalid Number!");
            }
        }
    }
}