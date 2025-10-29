class Solution {
    public boolean isAcronym(List<String> words, String s) {
       String s1="";
       for(String i:words)
       {
            s1+=i.charAt(0);
       }
       System.out.println(s1);
       return s1.equals(s); 
    }
}