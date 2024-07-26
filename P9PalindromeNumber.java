public class Solution {
    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
    }
    public static boolean isPalindrome(int x) {
        String old = String.valueOf(x);
        String rev = "";
        for (int i = old.length() - 1; i >= 0; i--) {
            rev += old.charAt(i);
        }
        return old.equals(rev);
    }
}
