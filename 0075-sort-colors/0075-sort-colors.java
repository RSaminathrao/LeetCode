class Solution {
    public void sortColors(int[] nums) {
    
    //Dutch national flag
       int l=0;
       int m=0;
       int h=nums.length-1;

       while(m<=h)
       {
            if(nums[m]==0)
            {
                int c=nums[m];
                nums[m]=nums[l];
                nums[l]=c;
                l++;
                m++;
            }
            else if(nums[m]==1)
                m++;
            else
            {
                int c=nums[m];
                nums[m]=nums[h];
                nums[h]=c;
                h--;
            }
       }

    //o(n+n)=o(2n)
    //    int zerocount = 0,onescount = 0,twoscount = 0;
    //    for(int i=0;i<nums.length;i++)
    //         if(nums[i]==0)
    //             zerocount++;
    //         else if(nums[i]==1)
    //             onescount++;
    //         else
    //             twoscount++;

    //     for(int i=0;i<zerocount;i++)
    //         nums[i]=0;
    //     for(int i=zerocount;i<zerocount+onescount;i++)
    //         nums[i]=1;
    //     for(int i=onescount+zerocount;i<zerocount+onescount+twoscount;i++)
    //         nums[i]=2;
    }
}