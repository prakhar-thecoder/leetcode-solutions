import java.lang.reflect.Array;
import java.util.Arrays;

public class P26RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int[] nums = {1,1,2};
        int[] expectedNums = {1,2};
//        int[] nums = {0,0,1,1,1,2,2,3,3,4};
//        int[] expectedNums = {0,1,2,3,4};

        int k = removeDuplicates(nums);

        if (k != expectedNums.length) {
            System.out.println("Failed for length: " + k);
            return;
        }
        for (int i = 0; i < k; i++) {
            if (nums[i] != expectedNums[i]) {
                System.out.println("Failed for order: " + Arrays.toString(nums));
                return;
            }
        }
        System.out.println("Passed: " + Arrays.toString(nums));
    }
    public static int removeDuplicates(int[] nums) {
        if (nums.length < 1) {
            return 0;
        }

        int i = 1;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[j-1]) {
                nums[i] = nums[j];
                i += 1;
            }
        }

        return i;
    }
}
