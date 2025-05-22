import java.util.HashSet;

public class Subset {
    public static void main(String[] args) {
        int a[]={2,4,3};
        int b[]={2,5,4,3,6,7};
        HashSet<Integer> setB=new HashSet<>();
        for(int num:b){
            setB.add(num);
        } boolean isSubset=false;
        for(int num:a){
            if(!setB.contains(num)){
                isSubset=true;
                break;
            }
        }
         if (!isSubset) {
            System.out.println("a[] is a subset of b[]");
        } else {
            System.out.println("a[] is NOT a subset of b[]");
        }
    }
}
