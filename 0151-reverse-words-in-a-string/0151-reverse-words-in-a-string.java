class Solution {
    public String reverseWords(String s) {
       String[] arr=s.split(" +");
       StringBuffer sb=new StringBuffer();
       for(int i=arr.length-1;i>=0;i--)
       {
            sb.append(arr[i]);
            sb.append(" ");
       }
       
       return sb.toString().trim();
    }
}