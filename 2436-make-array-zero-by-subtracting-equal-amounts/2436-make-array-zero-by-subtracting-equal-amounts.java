class Solution {
    public int minimumOperations(int[] nums) {
        Arrays.sort(nums);
        int c=0;
        while(nums[nums.length-1]!=0)
        {
            int min=0,minset=0;
            c++;
            for(int i=0;i<nums.length;i++)
            {
                if(nums[i]==0)
                    continue;
                else
                {
                    if(minset==0)
                    {
                        min=nums[i];
                        minset=1;
                    }
                    nums[i]=nums[i]-min;

                }
                
            }
        }
        return c;
    }
}