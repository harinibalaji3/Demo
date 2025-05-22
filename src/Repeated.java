public class Repeated {
    public static void main(String[] args) {
        int []arr={3,5,2,3};
        boolean flag=false;
        for(int i=0;i<arr.length-1;i++){
            for(int j=1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    flag=true;
                }
                   
            }
        }
        if(flag){
            System.out.println(" duplicate");
        }else{
            System.out.println("not duplicate");
        }
    }
}
