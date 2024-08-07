package Recursion.PalindromeString;

public class PalindromeString {
    private static boolean isPalindrome(String str, int l, int r) {
        if (l >= r) return true;
        return str.charAt(l) == str.charAt(r) && isPalindrome(str, l+1, r-1);
    }
    private static String isPalindrome(String str) {
        boolean isPalindrome = isPalindrome(str, 0 , str.length() -1);
        return isPalindrome ? "True" : "False";
    }
    public static void main(String[] args) {
        String str = "MADAME";
        System.out.println(isPalindrome(str));
    }
}
