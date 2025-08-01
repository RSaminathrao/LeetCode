class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        k=k%n;    //handle k greater than n
        reverse(nums,0,n-1);
        reverse(nums,0,k-1);
        reverse(nums,k,n-1);
    }
    void reverse(int[] nums, int start, int end)
    {
        while(start<=end)
        {
            int c=nums[start];
            nums[start]=nums[end];
            nums[end]=c;
            start++;
            end--;
        }
    }
}