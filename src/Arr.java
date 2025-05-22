
import java.util.Scanner;

public class Arr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];//A container that holds multiple elements
        System.out.println("enter array:");
        for (int i = 0; i < 5; i++) {
          arr[i] = sc.nextInt();
        }
        int dig = arr.length;
        for (int i = 0; i < dig; i++)
            System.out.println((arr[i]));
            sc.close();
    }
}
