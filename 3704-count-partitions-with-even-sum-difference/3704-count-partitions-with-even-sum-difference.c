int countPartitions(int* nums, int numsSize) {
    int psum[numsSize],i,evencount=0;
    psum[0]=nums[0];
    for(i=1;i<numsSize;i++)
    {
        psum[i]=psum[i-1]+nums[i];
    }
    for(i=0;i<numsSize-1;i++)
    {
        int diff=psum[i]-psum[numsSize-1]+psum[i];
        if(diff%2==0)
            evencount++;
    }
    return evencount;
}