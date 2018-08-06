class Solution {
    public void nextPermutation(int[] nums) {
        if (nums.length <= 1) return; // special case
        //one pass
        int i = nums.length - 1;
        int p = nums.length - 1;
        while (i >= 1){
            if (nums[i] > nums[i - 1]){
                if(i != nums.length - 1){
                    for(int j = nums.length - 1; j >= i; j--){
                        if (nums[j] > nums[i - 1]){
                            p = j;
                            break;
                        }
                    }
                    swap(nums, i - 1, p);
                    reverse(nums, i, nums.length);
                } else { // All ascending
                    reverse(nums, nums.length - 2, nums.length);
                }
                break;
            }
            i--;
        }
        
        if (i == 0) reverse(nums, 0, nums.length); // All descending
    }
    public void reverse(int[] nums, int begin, int end){
        for(int i = 0; i < (end - begin)/2; i++){
            int temp = nums[i + begin];
            nums[i + begin] = nums[end - i - 1];
            nums[end - i - 1] = temp;
        }
    }
    public void swap(int[] nums, int a, int b){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}
