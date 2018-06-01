class Solution {
    public int[] twoSum(int[] nums, int target){
        int current;
        for (int i = 0; i < nums.length; i++){
            for (int j = 0; j < nums.length; j++){
                if (i != j && nums[i] + nums[j] == target){
                    int[] result = new int[]{i, j}; 
                    return result;
                }
            }
        }
        return null;
    }
}
