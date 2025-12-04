
public class No5
{
    public static void main (String [] args){
        int [] arr ={1,2,3,4,5,6,7,8,9,0};
        int i = 8;

        for(int x = 0; x < arr.length; x++){
            if(arr[x] == i){
                System.out.println("Found! " + x);
                break;
            }
        }
    }
}