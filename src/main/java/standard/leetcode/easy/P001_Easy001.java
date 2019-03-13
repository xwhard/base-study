package standard.leetcode.easy;

/**
 * @author:xwh
 * @date 2019/3/13 16:13
 */
public class P001_Easy001 {
    public int[] twoSum(int[] nums, int target) {
        int[] result  =  new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                    break;
                }
            }
        }
        return result;
    }
}