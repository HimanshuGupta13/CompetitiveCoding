class Solution {
    public int numSubarrayBoundedMax(int[] nums, int left, int right) {
        int invalid = -1;   
        int valid = -1;  
        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > right) {
                invalid = i;
            }
            if (nums[i] >= left && nums[i] <= right) {
                valid = i;
            }
            ans += Math.max(0, valid - invalid);
        }
        return ans;
    }
}