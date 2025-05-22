import java.util.Arrays;

public class Secondlargest {
    public static int array (int[]arr){
         Arrays.sort(arr);
        int size=arr.length;
        for(int i=size-2;i>=0;i--){
            if(arr[i]!=arr[size-1])
            {
                return arr[i];
                
            }
            
        }return -1;
        
    }
    public static void main(String[] args) {
        int []arr={33,54,72,32,16,32,72};
        int sec=array(arr);

        System.out.println("Second largest number"+sec);
       
       
    }
}
