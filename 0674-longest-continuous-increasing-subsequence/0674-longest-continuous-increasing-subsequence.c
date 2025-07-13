int findLengthOfLCIS(int* nums, int numsSize) {
    int i=0,j=1,maxlen=1,len=1;
    while(j<numsSize)
    {
        if(nums[i]<nums[j])
            len++;
        else
            len=1;
        if(len>maxlen)
            maxlen=len;
        i++;
        j++;
    }
    return maxlen;
}