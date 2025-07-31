class Solution {
    public int removeDuplicates(int[] nums) {
        int i=0;
        for(int j=1;j<nums.length;j++)
        {
            if(nums[i]!=nums[j])
            {
                i++;
                int c=nums[i];
                nums[i]=nums[j];
                nums[j]=c;
            }
        }
        return i+1;
    }
}