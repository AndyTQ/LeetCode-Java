public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
    Arrays.sort(nums);
    List<List<Integer>> result = new ArrayList<List<Integer>>(); 
    for (int i = 0; i < nums.length-2; i++) {
        if (i > 0 && nums[i] == nums[i-1]) continue; // AVOID Duplicates!!
        // Two pointers.
        int start = i+1;
        int end = nums.length-1;
        int sum = 0 - nums[i]; //complement of nums[i]
        while (start < end) {
            if (nums[start] + nums[end] == sum) {
                result.add(Arrays.asList(nums[i], nums[start], nums[end]));
                while (start < end && nums[start] == nums[start+1]) start++; //if nums[start] == nums[start+1] that means theres duplicate.
                while (start < end && nums[end] == nums[end-1]) end--; //same as the comment above.
                start++;  
                end--; 
                //we gonna reduce BOTH start AND end by 1; this is the only way we can find new pairs.
                // if we only do start++ or end--, it is impossible to match target again since the list is sorted 
                // and singular start++ or end-- will always result in a smaller (or larger) number.
            } 
            else if (nums[start] + nums[end] < sum) {
                start++; // too small.
            }
            else {
                end--;
            } //too large.
       } 
    }
    return result;
    }
}
