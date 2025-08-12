class Solution {
    public String sortVowels(String s) {
      Queue<Character> q=new PriorityQueue<>();
      String ans="";
      for(int i=0;i<s.length();i++)
      {
        char c=s.charAt(i);
        if(c=='a'||c=='A'||c=='e'||c=='E'||c=='i'||c=='I'||c=='o'||c=='O'||c=='u'||c=='U')
            q.add(c);
      }
      for(int i=0;i<s.length();i++)
      {
           char c=s.charAt(i);
           if(c=='a'||c=='A'||c=='e'||c=='E'||c=='i'||c=='I'||c=='o'||c=='O'||c=='u'||c=='U')
            {
                ans+=q.remove();
                continue;
            }    
            ans+=c;
      }
      return ans;  
    }
}