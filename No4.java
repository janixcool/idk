
public class No4
{
    public static void main (String [] args){
        int arr[] = {5,8,2,3,9,1,4,7,6};
        int small = arr[0];
        int large = arr[0];

        for (int x = 1; x < arr.length; x++) {
            if(arr[x] <= small){
                small = arr[x];
            }
            if(arr[x] >= large){
                large = arr[x];
            }
        }
        System.out.println("Smallest Number " + small);
        System.out.println("Largest Number " + large);
    }
}
