import java.util.Scanner;

public class Gcd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a");
        int a=sc.nextInt();//a=10
        System.out.println("enter b");
        int b=sc.nextInt();//b=5
        while(b!=0){
            int temp = b;//temp=5 ; b=5;a=5 ->b!=0 ->temp =5 b=0 a=5;
            b = a % b;//gcd(b,a%b)=(5,10%5)=(5,0)=5
            a = temp;
        }
        System.out.println(a);
        sc.close();

    }
}
