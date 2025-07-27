int countHillValley(int* nums, int numsSize) {
    int c=0;
    for(int i=1;i<numsSize-1;i++)
    {
        int hill=0;
        int valley=0;

        for(int j=i-1;j>=0;j--)
        {
            if(nums[j]>nums[i])
            {
                valley++;
                break;
            }
            else if(nums[j]==nums[i])
            {
                break;
            }
            else
            {
                hill++;
                break;
            }
        }
        for(int j=i+1;j<numsSize;j++)
        {
            if(nums[j]>nums[i])
            {
                valley++;
                break;
            }
            else if(nums[j]==nums[i])
            {
                continue;
            }
            else
            {
                hill++;
                break;
            }
        }
        if(valley==2||hill==2)
        {
            c++;
            printf("%d\n",nums[i]);
        }
            
    }
    return c;
}