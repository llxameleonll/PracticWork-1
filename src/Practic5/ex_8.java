package Practic5;

public class ex_8 {
    public static void main(String[] args) {
        String word = "asfafsa";
        boolean check = isPalindrome(word);
        if (check) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
    private static boolean isPalindrome(String word) {
        if (word.length() < 2) {
            return true;
        }
        char first = word.charAt(0);
        char last = word.charAt(word.length() - 1);
        if (first != last) {
            return false;
        } else {
            String t = word.substring(1, word.length() - 1);
            return isPalindrome(t);
        }
    }
}
