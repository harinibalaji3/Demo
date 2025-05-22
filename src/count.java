public class count {
    public static void main(String[] args) {
        int arr[]={3,5,7,8,9};
        int n=arr.length;
        int count=0;
        for(int i=0;i<n;i++){
            arr[i]=count++;
            
        }
        System.out.println(count);
    }
}
