class Solution {
    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        int s=0;
        for(int i=0;i<nums.size();i++)
        {
            int j=i;
            int c=0;
            while(j!=0)
            {
                j=j&j-1;
                c++;
            }
            if(c==k)
                s+=nums.get(i);
        }
        return s;
    }
}