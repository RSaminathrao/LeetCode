class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int c=0,maxc=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==1)
                c++;
            else
                c=0;
            maxc=Math.max(c,maxc);
        }
        return maxc;
    }
}