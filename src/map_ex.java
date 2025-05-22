import java.util.HashMap;
import java.util.*;

public class map_ex {
    public static void main(String[] args) {
        Map<String ,Integer> students=new HashMap<>();
        students.put("harini",90);
        students.put("monika",90);
        students.put("deepa",100);
        System.out.println(students);
        System.out.println(students.get("monika"));
        System.out.println(students.keySet());
        for(String key:students.keySet()){
         System.out.println(key + " : " +students.get(key));
        }


    }
}
