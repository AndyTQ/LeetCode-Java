class Solution {
    public int threeSumClosest(int[] nums, int target) {
    Arrays.sort(nums);
    int result = Integer.MAX_VALUE;
    for (int i = 0; i < nums.length-2; i++) {
        if (i > 0 && nums[i] == nums[i-1]) continue; // AVOID Duplicates!!
        int start = i+1;
        int end = nums.length-1;
        while (start < end) {
            // DISTANCE between current sum and the target
            int difference = nums[i] + nums[start] + nums[end] - target;
            //Math.abs(Integer.MAX_VALUE) will cause error.
            if (result == Integer.MAX_VALUE || Math.abs(difference) < Math.abs(result-target)){ 
                result = nums[i] + nums[start] + nums[end];
            }
            if (difference == 0) {
                return target;
            }
            else if (difference < 0) start++;//need to get closer by moving start
            else end--;
       } 
    }
    return result;
    }
}
