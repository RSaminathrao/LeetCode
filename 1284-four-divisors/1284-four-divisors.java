class Solution {
    public int sumFourDivisors(int[] nums) {
        int sum=0;
        for(int i:nums)
        {
            int s=0;
            int c=0;
            for(int j=1;j<=(int)Math.sqrt(i);j++)
            {
                if(i%j==0)
                {
                    s=s+j;
                    s=s+i/j;
                    c+=2;
                    if(i/j==j)
                    {
                        c--;
                        s=s-i/j;
                    }
                }
            }
            if(c==4)
                {
                    sum=sum+s;
                }
        }
        return sum;
    }
}