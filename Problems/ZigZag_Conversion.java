// Beat ~57%
class Solution {
    public String convert(String s, int numRows) {
        if(numRows <= 1) return s;
        StringBuilder converted = new StringBuilder();
        StringBuilder[] sb = new StringBuilder[numRows]; // A list of StringBuilders
        // Initialize
        for(int i = 0; i < sb.length; i++) {
            sb[i]= new StringBuilder("");  
        }
        boolean up = false, down = true;
        int cur_row = 0;
        for (int i = 0; i < s.length(); i++){
            sb[cur_row].append(s.charAt(i));
            if (down){
                cur_row ++;
                if (cur_row == numRows - 1){
                    down = false;
                    up = true;
                }
            }
            else if (up){
                cur_row --;
                if (cur_row == 0){
                    down = true;
                    up = false;
                }
            }
        }
        for (int i = 0; i < numRows; i++){
            converted.append(sb[i]);
        }
        return converted.toString();
    }
}
