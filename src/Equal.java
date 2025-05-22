import java.util.Arrays;
public class Equal{
    public static void main(String[] args) {
        int []a={4,3,2,5};
        int []b={2,4,3,5};
        for(int i=0;i<a.length-1;i++){
            for(int j=0;j<a.length-1-i;j++){
                if(a[j]>a[j+1]){
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
        }}}System.out.println(Arrays.toString(a));
        for(int i=0;i<b.length-1;i++){
            for(int j=0;j<b.length-1;j++){
                if(b[j]>b[j+1]){
                    int temp=b[j];
                    b[j]=b[j+1];
                    b[j+1]=temp;
        }}}System.out.println(Arrays.equals(a,b));
        if(a.equals(b)){
            System.out.println("Equal");
        }

        }
    }
