int* resultArray(int* nums, int numsSize, int* returnSize) {
  int* a=(int*)malloc(numsSize*sizeof(int));
  int* b=(int*)malloc(numsSize*sizeof(int));
  int* c=(int*)malloc(numsSize*sizeof(int));
  int l=0,k=0,j=0;
  a[k++]=nums[0];
  b[l++]=nums[1];
  for(int i=2;i<numsSize;i++)
  {
    if(a[k-1]>b[l-1])
        a[k++]=nums[i];
    else
        b[l++]=nums[i];
  }
  for(int i=0;i<k;i++)
        c[j++]=a[i];
  for(int i=0;i<l;i++)
        c[j++]=b[i]; 
    *returnSize=numsSize;
    return c; 
}