class Solution {
    public int sumFourDivisors(int[] nums) {
        int divfullsum=0;
        for(int i:nums)
        {
            int divcount=2;
            int divsum=i+1;
           for (int j = 2; j <= (int)Math.sqrt(i); j++) 
           {
            if (i % j == 0) 
            {
                if (j * j == i) 
                {
                    divcount++;
                    divsum += j;
                }
                else
                 {
                     divcount += 2;
                     divsum += j + i / j;
                }
            }
        }

        if(divcount==4)
        {
            divfullsum+=divsum;
        }
    }
        return divfullsum;
    }
}