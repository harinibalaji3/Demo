import java.util.Arrays;

public class Reverse {
    public static void main(String[] args) {
        int []a={4,3,2,5};
        int start=0;
        int end=a.length-1;
        while(start<end){
            int temp=a[start];
            a[start]=a[end];
            a[end]=temp;
            start++;
            end--;
        }
        System.out.println(Arrays.toString(a));
    }
}
