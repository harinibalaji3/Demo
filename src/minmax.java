

public class minmax {
    public static void main(String[] args) {
       
        int []arr={1,4,2,7,5};
        int min=arr[0];
        int max=arr[0];
        for(int i=0;i<5;i++){
        if(arr[i]<min){
         min=arr[i];   
        }
        if(arr[i]>max){
            max=arr[i];
        }
    }System.out.println(min);
    System.out.println(max);
    }
}

