public class Lastdigit {
    public static void main(String[] args) throws Exception {
        String a = "16";
        String b = "3";
        int ans = Integer.parseInt(a);
        int ans1 = Integer.parseInt(b);
        double res = Math.pow(ans, ans1);
        while (res > 0) {
            res = res % 10;
            System.out.println(res);
            break;
        }
    }
}
