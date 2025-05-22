import java.util.Arrays;
import java.util.Scanner;

public class RotationK {
    public static void main(String[] args) {
        int[]arr={7,6,5};
        int n=arr.length;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of Rotation K");
        int k=sc.nextInt();
        for(int i=0;i<k;i++){
            int last=arr[n-1];
            for(int j=n-1;j>0;j--){
                arr[j]=arr[j-1];
        }
        arr[0]=last;
    }
        System.out.println(Arrays.toString(arr));
        sc.close();

    }
}
    
