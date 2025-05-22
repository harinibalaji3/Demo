import java.util.Scanner;

public class Divisor {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter n");
    int sum=0;
    int n=sc.nextInt();
   
    for(int i=1;i<=n;i++){
        if(n%i==0){
          System.out.println(i);
           sum=sum+i;
        }
       
    }
    System.out.println(sum);
    sc.close();
}    
}
