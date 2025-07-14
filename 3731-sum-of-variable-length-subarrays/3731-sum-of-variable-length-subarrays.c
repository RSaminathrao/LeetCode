int subarraySum(int* nums, int numsSize) {
   int psum[numsSize],i,s=0;
    psum[0]=nums[0];
    for(i=1;i<numsSize;i++)
    {
        psum[i]=psum[i-1]+nums[i];
    }
    for(i=0;i<numsSize;i++)
    {
        int start=(0>i-nums[i])?0:i-nums[i];
        if(start==0)
        {
            s=s+psum[i];
        }
        else
        {
            s=s+psum[i]-psum[start-1];
        }
    }
    return s;
}