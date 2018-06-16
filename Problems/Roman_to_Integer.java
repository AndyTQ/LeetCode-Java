class Solution {
    public int romanToInt(String s) {
        int result = 0;
        for (int i = s.length() - 1; i >= 0; i--){
            int a = 0;
            if (s.charAt(i) == 'M'){
                if (i != 0 && s.charAt(i - 1) == 'C'){
                    a = 900;
                    i--;
                } else {a = 1000;}
            }
            else if (s.charAt(i) == 'D'){
                if (i != 0 && s.charAt(i - 1) == 'C'){
                    a = 400;
                    i--;
                } else {a = 500;}
            }
            else if (s.charAt(i) == 'C'){
                if (i != 0 && s.charAt(i - 1) == 'X'){
                    a = 90;
                    i--;
                } else {a = 100;}
            }
            else if (s.charAt(i) == 'L'){
                if (i != 0 && s.charAt(i - 1) == 'X'){
                    a = 40;
                    i--;
                } else {a = 50;}
            }
            else if (s.charAt(i) == 'X'){
                if (i != 0 && s.charAt(i - 1) == 'I'){
                    a = 9;
                    i--;
                } else {a = 10;}
            }
            else if (s.charAt(i) == 'V'){
                if (i != 0 && s.charAt(i - 1) == 'I'){
                    a = 4;
                    i--;
                } else {a = 5;}
            }
            else{
                a = 1;
            }
            result += a;
        }
        return result;
    }
}
