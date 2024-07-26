import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Solution {
    public static void main(String[] args) {
        System.out.println("Result: " + isValid("["));
    }
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        ArrayList<Character> openBrackets = new ArrayList<>(
                List.of(new Character[]{'(', '{', '['})
        );
        ArrayList<Character> closeBrackets = new ArrayList<>(
                List.of(new Character[]{')', '}', ']'})
        );
        for (int i = 0; i < s.length(); i++) {
            if (openBrackets.contains(s.charAt(i))) {
                stack.push(s.charAt(i));
            } else {
                if (stack.empty())
                    return false;
                if (closeBrackets.indexOf(s.charAt(i)) != openBrackets.indexOf(stack.pop())) {
                    return false;
                }
            }
        }
        return stack.empty();
    }
}
