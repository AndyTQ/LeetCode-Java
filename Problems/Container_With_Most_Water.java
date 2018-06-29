class Solution {
    public int maxArea(int[] height) {
        // method 1: brute force
        int max_area = 0;
        int i_left = 0;
        int i_right = height.length - 1;
        int cur_area = 0;
        while(i_left != i_right){
            cur_area = ((i_right - i_left) * Math.min(height[i_left], height[i_right]));
            if (cur_area > max_area) max_area = cur_area;
            if (height[i_left] > height[i_right]){
                i_right--;
                }
            else{
                i_left++;
            }
        }

        return max_area;
    }
}
