class Solution {
    public int searchInsert(int[] nums, int target) {
        int i = 0, j = nums.length - 1, p;
        while (i <= j){
            p = i + (j - i) / 2; 
            if (nums[p] < target) i = p + 1;
            else if (nums[p] > target) j = p - 1;
            else return p;
        }
        return i;
    }
}
