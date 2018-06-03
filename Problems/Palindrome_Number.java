class Solution {
    public boolean isPalindrome(int x) {
        String strx = Integer.toString(x);
        for (int i = 0; i < strx.length(); i++){
            if (strx.charAt(i) != strx.charAt(strx.length() - i - 1)){
                return false;
            }
            if (i > strx.length() - 1 - i) break;
        }
        return true;
    }
}
