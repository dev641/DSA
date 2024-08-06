package Recursion.printNTo1;

public class PrintNTo1 {
    public static void print(int n) {
        if (n == 0) return;
        System.out.println(n);
        print(n-1);
    }
    public static void main(String[] args) {
        int n = 6;
        print(n);
    }
}
