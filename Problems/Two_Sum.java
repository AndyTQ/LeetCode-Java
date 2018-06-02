// Brute-force solution: O(n^2)
// class Solution {
//     public int[] twoSum(int[] nums, int target){
//         int current;
//         for (int i = 0; i < nums.length; i++){
//             for (int j = 0; j < nums.length; j++){
//                 if (i != j && nums[i] + nums[j] == target){
//                     int[] result = new int[]{i, j}; 
//                     return result;
//                 }
//             }
//         }
//         return null;
//     }
// }

// Hash-Table solution:
class Solution {
    public int[] twoSum(int[] nums, int target){
        int[] result = new int[2];
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++){
            if (map.containsKey(target - nums[i])){
                result[0] = map.get(target - nums[i]);
                result[1] = i;
                return result;
            }
            map.put(nums[i], i);
        }
        return null;
    }
}
