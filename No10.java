
public class No10
{
    public static void main (String [] args){
        int arr[] = {1,2,3,4,5,6,7,8,9};
        int index = -1;

        for (int x = 0; x < arr.length; x++) {
            if (arr[x] % 2 == 0) {
                index = x;
                break;
            }
        }

        System.out.println("First even index: " + index);

    }
}