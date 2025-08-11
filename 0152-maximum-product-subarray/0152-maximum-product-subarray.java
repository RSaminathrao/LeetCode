class Solution {
    public int maxProduct(int[] nums) {
        int lproduct=1,rproduct=1,maxproduct=nums[0];
        int j=nums.length-1;
        for(int i=0;i<nums.length;i++)
        {
            if(lproduct==0)
                lproduct=1;
            if(rproduct==0)
                rproduct=1;

            lproduct=lproduct*nums[i];
            rproduct=rproduct*nums[j--];

            maxproduct=Math.max(maxproduct,Math.max(lproduct,rproduct));
        }
        return maxproduct;
    }
}