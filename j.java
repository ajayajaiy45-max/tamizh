class Solution {
    public int firstMissingPositive(int[] nums) {
        boolean[] check = new boolean[nums.length + 1];

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0 && nums[i] <= nums.length) {
                check[nums[i]] = true;
            }
        }

        for (int i = 1; i <= nums.length; i++) {
            if (check[i] == false) {
                return i;
            }
        }

        return nums.length + 1;
    }
}