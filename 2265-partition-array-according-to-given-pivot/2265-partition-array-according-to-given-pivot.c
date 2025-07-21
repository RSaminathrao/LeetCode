/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* pivotArray(int* nums, int numsSize, int pivot, int* returnSize) {
    int* a=(int*)malloc(numsSize*sizeof(int));
    int i,j=0;
    for(i=0;i<numsSize;i++)
        if(nums[i]<pivot)
            a[j++]=nums[i];
    for(i=0;i<numsSize;i++)
        if(nums[i]==pivot)
            a[j++]=nums[i];
    for(i=0;i<numsSize;i++)
        if(nums[i]>pivot)
            a[j++]=nums[i];
    *returnSize=j;
    return a; 
}