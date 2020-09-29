package Practic5;

public class ex_7 {
    static void recur(int a, int b)
    {
        if(a <= 1)
            return;
        for(;;b++) {
            if (a % b == 0) {
                System.out.println(b);
                recur(a / b, b);
                return;
            }
        }
    }
    public static void main(String[] args)
    {
        int a = 45;
        recur(a, 2);
    }
}
