// Sol 1: Brute-Force. O(n^3). Slow!
class Solution {
    public String longestPalindrome(String s) {
        for (int i = s.length(); i > 0; i--){ //i is length of word
            for (int k = 0; k <= s.length() - i; k++){ //k is the starting index. loop through all pairs of the given length
                boolean is_palindrome = true;
                for (int j = 0; j < i; j++){ // check if is palindrome
                    if (s.charAt(k + j) != s.charAt(k + i - j - 1)){
                        is_palindrome = false;
                        break;
                    }
                }
                if (is_palindrome){
                    return s.substring(k, k + i);
                }
            }
        }
        return "";
    }
}

// Sol 2: O(n^2)
