package Recursion.print1toN;

public class Print1ToN {
    public static void print ( int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        print(n-1);
    }
    public static void main(String[] args) {
        int n = 6;
        print(n);
    }
}