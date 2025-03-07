class Solution {
    public int lengthOfLongestSubstring(String s) {
        int r=0;
        int l=0;
       int  maxlen=0;
        HashSet<Character>ans=new HashSet<>();
        while(r<s.length())
        {
            char ch=s.charAt(r);
            while(ans.contains(ch))
            {
                ans.remove(s.charAt(l));
                l++;
            }
            ans.add(ch);
            maxlen=Math.max(maxlen,r-l+1);
            r++;
        }
        return maxlen;
    }
}
