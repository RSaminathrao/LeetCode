int minimumSumSubarray(int* nums, int numsSize, int l, int r) {
   int psum[numsSize],i,minsum=INT_MAX,j;
    psum[0]=nums[0];
    for(i=1;i<numsSize;i++)
    {
        psum[i]=psum[i-1]+nums[i];
    }
    for(i=l;i<=r;i++)
    {
        int start=0;
        for(j=i-1;j<numsSize;j++)
        {
            int s=0;
            if(j==i-1)
            {
                s=psum[j];
            }
            else
            {
                s=psum[j]-psum[start++];
            }
            if(s>0&&s<minsum)
                minsum=s;
        }
    }
    if(minsum==INT_MAX)
        return -1;
    return minsum; 
}