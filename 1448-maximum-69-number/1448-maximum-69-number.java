class Solution {
    public int maximum69Number (int num) {
       String n=Integer.toString(num);
       return Integer.valueOf(n.replaceFirst("6","9"));
       
    }
}