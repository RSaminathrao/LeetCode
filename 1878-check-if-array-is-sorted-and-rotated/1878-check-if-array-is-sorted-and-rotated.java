class Solution {
    public boolean check(int[] nums) {
        int[] nums2=Arrays.copyOf(nums,nums.length);
        Arrays.sort(nums);
        return rotatecheck(nums,nums2);
    }
    boolean rotatecheck(int[] a,int[] b)
    {
        for(int i=1;i<=a.length;i++)
        {
            if(Arrays.equals(a,b))
                return true;
            int t=a[0];
            for(int j=1;j<a.length;j++)
                a[j-1]=a[j];
            a[a.length-1]=t;
        }
        return false;
    }
}