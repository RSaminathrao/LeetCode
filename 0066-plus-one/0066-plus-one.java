class Solution {
    public int[] plusOne(int[] digits) {
        int carry=0,a=0;
        List<Integer> list=new ArrayList<>();
        for(int i=digits.length-1;i>=0;i--)
        {
            if(i==digits.length-1)
            {
                a=digits[i]+1+carry;
            }
            else
            {
                a=digits[i]+carry;
            }
            System.out.println(a);
            if(a>9)
            {
                list.add(a%10);
                carry=a/10;
            }
            else
            {
                list.add(a);
                carry=0;
            }
                
        }

        System.out.println(list);

        if(carry>0)
           list.add(carry);

        int[] ans=new int[list.size()];
        int k=0;

        for(int i=list.size()-1;i>=0;i--)
            ans[k++]=list.remove(i);

        return ans; 

    }
}