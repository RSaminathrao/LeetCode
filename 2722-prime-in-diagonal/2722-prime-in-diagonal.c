int isprime(int n)
{
    if(n==2)
        return 1;
    else if(n%2==0||n==1)
        return 0;
    else
    {
        int f=0;
        for(int i=3;i<=sqrt(n);i+=2)
        {
            if(n%i==0)
            {
                f=1;
                break;
            }
        }
        if(f==0)
            return 1;
        else
            return 0;
    }
    return 1;

}
int diagonalPrime(int** nums, int numsSize, int* numsColSize) {
    int i,j,maxprime=0;
    for(i=0;i<*numsColSize;i++)
        if(isprime(nums[i][i])==1&&nums[i][i]>maxprime)
            maxprime=nums[i][i];
    j=*numsColSize-1;
    for(i=0;i<numsSize;i++)
    {
        if(isprime(nums[i][j])==1&&nums[i][j]>maxprime)
            maxprime=nums[i][j];
        j--;
    }
    return maxprime;
}

