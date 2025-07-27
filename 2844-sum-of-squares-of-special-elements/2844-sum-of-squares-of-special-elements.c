int sumOfSquares(int* nums, int numsSize) {
    int s=0;
    for(int i=0;i<numsSize;i++)
    {
        if(numsSize%(i+1)==0)
        {
            s=s+(nums[i]*nums[i]);
        }
    }
    return s;
}