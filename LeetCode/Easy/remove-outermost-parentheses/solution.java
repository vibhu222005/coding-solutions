class Solution {
    public String removeOuterParentheses(String s) {
        int count = 0;
        int start = 0;
        StringBuilder str = new StringBuilder();

        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '(') {
                count++;
            } else {
                count--;
            }

            if(count == 0) {
                // append inner part
                str.append(s.substring(start + 1, i));
                start = i + 1;
            }
        }
        return str.toString();
    }
}