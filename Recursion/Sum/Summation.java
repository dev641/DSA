package Recursion.Sum;

public class Summation {
    private static int sum = 0;
    public static int paramaterisedSum(int n) {
        if (n == 0) {
            return n;
        }
        sum += n + paramaterisedSum(n-1);
        return sum;

    }

    public static int rSum(int n) {
        if (n == 0) {
            return n;
        }
        return  n + rSum(n-1);

    }


    public static void main(String[] args) {
        int n = 6;
        int res = paramaterisedSum(n);
        int res1 = rSum(n);
        System.out.println(res);
        System.out.println(res1);
    }
}
