class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.length()>t.length()) return false;
        if(s.length()==0) return true;
        int i=0;
        int len=s.length();
        for(char c:t.toCharArray())
        {
            if(s.charAt(i)==c)
            {
                len--;
                i++;
            }
            if(i == s.length()) break;
        }
        if(len==0) return true;
        return false;
    }
}