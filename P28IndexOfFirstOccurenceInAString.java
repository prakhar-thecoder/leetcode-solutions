public class Solution {
    public int strStr(String haystack, String needle) {
        for(int i = 0; i < haystack.length(); i++) {
            if (haystack.charAt(i) == needle.charAt(0)) {
                boolean found = true;
                try {
                    for (int temp = i, j = 0; j < needle.length(); temp++, j++) {
                        if (haystack.charAt(temp) != needle.charAt(j)) {
                            found = false;
                            break;
                        }
                    }
                } catch(StringIndexOutOfBoundsException e) {
                    found = false;
                }
                if (found) {
                    return i;
                }
            }
        }
        return -1;
    }
}
