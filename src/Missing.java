public class Missing {
    public static void main(String[] args) {
        int[] arr={1,4,5,3};
        int sum1=0;
        for(int i=0;i<arr.length;i++){
            sum1+=arr[i];
        }System.out.println(sum1);
        int sum2=0;
        for(int i=0;i<6;i++){
            sum2+=i;
        }System.out.println(sum2);
        System.out.println(sum2-sum1);
    }
}
