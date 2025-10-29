class Solution {
    public String clearDigits(String s) {
        Stack<Character> stk=new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            if(Character.isDigit(s.charAt(i)))
                stk.pop();
            else
                stk.push(s.charAt(i));
        }
        StringBuffer sb=new StringBuffer();
        while(!stk.isEmpty())
        {
            sb.append(stk.pop());
        }
        return sb.reverse().toString();
    }
}