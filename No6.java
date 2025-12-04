public class no6
{
    public static void main (String [] args){
        int arr[] = {1,2,3,4,5,6,7,8,9};
        int sum = 0, count = 0;

        for(int x = 0; x < arr.length; x++){
            if(arr[x] % 2 != 0){
                sum += arr[x];
                count++;
            }
        }
        double avg = (double) sum / count;
        System.out.println("The Average of all odd numbers in array is " + avg);
    }
}
