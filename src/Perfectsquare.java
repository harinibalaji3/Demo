public class Perfectsquare {
    public static int square(int n){
        for(int i=1;i<=n;i++){
          if(i*i == n){
            return n;
          }  
        }
        return -1;
    }
    public static void main(String[] args) {
        int res=square(7);
        if(res!=-1){
        System.out.println(res + " is perfect squareroot");
        }else{
            System.out.println("It is not perfect squareroot");
        }
    }
}


