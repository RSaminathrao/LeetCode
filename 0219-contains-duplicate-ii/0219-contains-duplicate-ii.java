class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int n = nums.length;
        for(int i = 0;i < n;i++){
            for(int j = i+1;(Math.abs(i-j) <= k)& j<n;j++){
                if(nums[i] == nums[j] && Math.abs(i-j) <= k) return true;
            }
        }
        return false;
        

    }
}