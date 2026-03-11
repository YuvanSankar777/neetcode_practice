class Solution {
    public boolean isAnagram(String s, String t) {
        int vis[]=new int[26];
        if(s.length()!=t.length()) return false;
        for(char c:s.toCharArray())
        {
            int asc=c-97;
            vis[asc]+=1;
        }
        for(char c:t.toCharArray())
        {
            int ascii=c-97;
            vis[ascii]-=1;
        }
        for(int i=0;i<vis.length;i++)
        {
            if(vis[i]>0) return false;
        }
        return true;
    }
}
