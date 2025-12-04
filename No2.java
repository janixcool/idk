public class No2
{
    public static void main (String [] args){
        int[] arr = {3,7,5,7,1,7,9,2,4,7};
        int count = 0;
        for(int x = 0; x < arr.length; x++){
            if(arr[x] == 7){
                count++;
            }
        }
        System.out.println("7 appears " + count + " times.");
    }
}