class Solution {
    public int strStr(String haystack, String needle) {
        if (needle.equals("")) return 0;
        int res = -1, needle_i = 0, fallback = 0;
        for (int i = 0; i < haystack.length(); i++){
            if (needle_i != 0 && haystack.charAt(i) == needle.charAt(0) && fallback == 0){
                fallback = i;
            }
            if (haystack.charAt(i) == needle.charAt(needle_i)){
                if (needle_i == 0) res = i;
                if (needle_i == needle.length() - 1) return res;
                needle_i ++;
            }
            else {
                if (fallback != 0) {
                    i = fallback - 1;
                    fallback = 0;
                }
                res = -1;
                needle_i = 0;
            }
        }
        return -1;
    }
}
