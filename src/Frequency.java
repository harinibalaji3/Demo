import java.util.Arrays;

public class Frequency {
    public static void main(String[] args) {
        int arr[]={3,4,3,2,1,4};
        int n=arr.length;
        int []result=new int[n];
        for(int num:arr){
            if(num>=1&&num<=n){
                result[num-1]++;//num = 3// Check: 3 >= 1 && 3 <= 5 →// Update: result[3 - 1]++ → result[2]++ → result = [0, 0, 1, 0, 0]
            }
        }System.out.println(Arrays.toString(result));
    }
}
