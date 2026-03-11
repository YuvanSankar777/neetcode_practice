class Solution {
    public int scoreOfString(String s) {
        char c[]=s.toCharArray();
        int sum=0;
        for(int i=0;i<c.length-1;i++)
        {
            int as1=c[i];
            int as2=c[i+1];
            int diff=Math.abs(as1-as2);
            sum+=diff;
        }
        return sum;
    }
}