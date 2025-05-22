public class Search {
    public static void main(String[] args) {
        int []arr={1,5,3,8};
        int s=6;
        boolean flag=false;
        for(int i=0;i<4;i++){
        if(arr[i]==s){
          flag=true;
          System.out.println("found");  
          break;
        }}
        if(!flag){
            System.out.println("Not found");
           
        }
    
    }
}
