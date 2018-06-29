class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0){
            return "";
        }
        else if (strs.length == 1) {
            return strs[0];
        }
        int shortest_length = 0;
        for (int i = 0; i < strs.length; i++){
            if (strs[i].equals("")) {
                return "";
            }
            if (shortest_length == 0) shortest_length = strs[i].length();
            if (strs[i].length() < shortest_length) {
                shortest_length = strs[i].length();
            }
        }
        
        for (int i = 0; i < shortest_length; i++){ //index of word
            boolean equal = true;
            for (int j = 0; j < strs.length - 1; j++){ //index of array
                // loop through each index for every word in the array
                if (strs[j].charAt(i) != strs[j + 1].charAt(i)){
                    if (i == 0){
                        return "";
                    }
                    else {return strs[0].substring(0, i);}
                }
            }
        }
        return strs[0].substring(0, shortest_length); //any of them should work.
    }
}
