class Solution {
    public int maximum69Number (int num) {
       String n=String.valueOf(num);
       return Integer.valueOf(n.replaceFirst("6","9"));
       
    }
}