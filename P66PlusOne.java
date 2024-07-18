import java.util.Arrays;

public class P66PlusOne {
    public int[] plusOne(int[] digits) {
        int[] result = new int[digits.length + 1];

        for (int i = digits.length - 1, j = result.length - 1; i >= 0; i--, j--) {
            if (digits[i] + 1 >= 10) {
                digits[i] = 0;
                result[j] = 0;
                result[j-1] += 1;
            } else {
                digits[i] += 1;
                return digits;
            }
            System.out.println(i + " " + j);
            System.out.println(Arrays.toString(result));
        }

        return result;
    }
}