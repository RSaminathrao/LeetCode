class Solution {
    public String reverseStr(String s, int k) {
        String ans="";
        int f=0;
      for(int i=0;i<s.length();i+=k)
      {
        int end = Math.min(i + k, s.length());
        if(f==0)
        {
            ans+=new StringBuffer(s.substring(i,end)).reverse().toString();
            f=1;
        }
        else
        {
            ans+=s.substring(i,end);
            f=0;
        }
      }
      return ans;  
    }
}