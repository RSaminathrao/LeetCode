class Solution {
    public int lengthOfLongestSubstring(String s) {
      Set<Character> set=new HashSet<>();
      int maxlen=0,l=0,r=0;
      while(r<s.length())
      {
        while(set.contains(s.charAt(r)))
        {
            set.remove(s.charAt(l));
            l++;
        }
        set.add(s.charAt(r));
        maxlen=Math.max(maxlen,set.size());
        r++;
      }
      return maxlen;
    }
}