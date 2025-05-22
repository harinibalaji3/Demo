
public class Pow {
    public static void main(String[] args) {
        double x=2;
        long n=10;
        if(n==0){
            System.out.println(1);//2^0=1
        }
        else if(n%2==0){
           double res=Math.pow(x*x,n/2);//gn n=10 -> 10/2=5 ->take n=4 then 2*2^5
           System.out.println(res);
        }
        else {
            double ans=Math.pow(x*x,n-1);//take n=4 2*2^9 if n%2!=0
            System.out.println(ans);
        }
    }
}
