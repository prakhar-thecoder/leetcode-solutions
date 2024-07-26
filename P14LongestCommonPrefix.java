public class Solution {
    public static void main(String[] args) {
        System.out.println("Result: " + longestCommonPrefix(new String[]{
                "dog", "racecar", "cat"
        }));
    }
    public static String longestCommonPrefix(String[] strs) {
        String result = "";
        int lowestLength = strs[0].length();
        for (String s: strs) {
            if (s.length() < lowestLength)
                lowestLength = s.length();
        }

        for (int i = 0; i < lowestLength; i++) {
            char c = strs[0].charAt(i);
            for (String s: strs) {
                if (s.charAt(i) != c)
                    return result;
            }
            result += c;
        }
        return result;
    }
}
