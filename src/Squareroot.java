public class Squareroot {
    public static int square(int n){
        for(int i=1;i<=n;i++){
          if(i*i == n){
            return i;
          }  
        }
        return -1;
    }
    public static void main(String[] args) {
        int res=square(4);
        if(res!=-1){
        System.out.println(res +"is square root");
        }else{
            System.out.println(res + " is not square root");
        }
    }
}
