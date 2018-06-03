class Solution {
    public int myAtoi(String str) {
        str = str.trim();
        if (str.length() == 0) return 0;
        
        boolean positive = true;
        int cur_char = 0;
        if (str.charAt(0) == '-'){
            positive = false;
            cur_char ++;
        }
        else if (str.charAt(0) == '+'){
            cur_char ++;
        }
        
        double result = 0;
        
        while (cur_char < str.length() && '9' >= str.charAt(cur_char) && str.charAt(cur_char) >= '0'){
            result = result * 10 + (str.charAt(cur_char) - '0');  
            cur_char++;
        }
        
        if (!positive) result *= -1;
        if (result > Integer.MAX_VALUE) return Integer.MAX_VALUE;  
        if (result < Integer.MIN_VALUE) return Integer.MIN_VALUE;  
        
        return (int) result;  
    }
}
