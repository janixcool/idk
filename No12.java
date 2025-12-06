public class No12
{
    public static void main (String [] args){
        int arr[] = {1,2,3,4,5,6,7,8,9};
        int target = 4;
        int count = 0;

        for (int x = 0; x < arr.length; x++) {
            if (arr[x] == target) {
                count++;
            }
        }

        if (count >= 3){
            System.out.println("Value appears at least 3 times");
        }else{
            System.out.println("Value appears less than 3 times");
        }
    }
}