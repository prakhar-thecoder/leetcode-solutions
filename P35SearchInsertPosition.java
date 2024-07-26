public class Solution {
    public int searchInsert(int[] nums, int target) {
        if (nums.length == 1) {
            if (nums[0] > target || nums[0] == target) {
                return 0;
            } else {
                return 1;
            }
        }

        int i;
        for (i = 0; i < nums.length - 1; i++) {
            if (nums[i] == target || nums[i] > target) {
                return i;
            }
            if (nums[i+1] == target || nums[i+1] > target) {
                return i+1;
            }
        }
        return i+1;
    }
}
