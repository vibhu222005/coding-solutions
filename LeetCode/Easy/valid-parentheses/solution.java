class Solution {
    public boolean isValid(String s) {
        int bracket1=0;
        int bracket2=0;
        int bracket3=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='(')
            {
                bracket1++;
            }
            if(s.charAt(i)=='(')
            {
                bracket1--;
            }
            if(s.charAt(i)=='[')
            {
                bracket2++;
            }
            if(s.charAt(i)==']')
            {
                bracket2--;
            }
            if(s.charAt(i)='{')
            {
                bracket3++;
            }
            if(s.charAt(i)='}')
            {
                bracket3--;
            }
        }
        
    }
}