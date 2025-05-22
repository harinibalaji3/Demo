public class Armstrong {
    public static void main(String[] args) {
        int n=154;
        int orgno=n;
        int sum=0;
        while(n!=0){
            int rem=n%10;//int  dig=String.valueOf(n).length;
            sum=sum+(rem*rem*rem);//sum+=Math.pow(rem,dig);
            n=n/10;
        }
        System.out.println(sum);
        if(sum==orgno){
            System.out.println("It is Armstrong");
        }
        else{
            System.out.println("It is not Armstrong");
        }
    }
}

