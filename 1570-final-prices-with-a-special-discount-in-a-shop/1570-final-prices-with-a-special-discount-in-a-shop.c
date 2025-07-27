/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* finalPrices(int* prices, int pricesSize, int* returnSize) {
    int* a=(int*)malloc(pricesSize*sizeof(int));
    int k=0;
    for(int i=0;i<pricesSize;i++)
    {
        int f=0;
        for(int j=i+1;j<pricesSize;j++)
        {
            if(prices[j]<=prices[i])
            {
                a[k++]=prices[i]-prices[j];
                f=1;
                break;
            }
        }
        if(f==0)
            a[k++]=prices[i];
    }
    *returnSize=k;
    return a;
}