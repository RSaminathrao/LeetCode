class Solution {
    public int thirdMax(int[] nums) {
        Integer[] nums1 = new Integer[nums.length];

        for (int i = 0; i < nums.length; i++)
            nums1[i] = nums[i];

        Arrays.sort(nums1, Collections.reverseOrder());

        int count = 1;
        int max = nums1[0];

        for (int i = 1; i < nums1.length; i++) {
            if (!nums1[i].equals(max)) {
                max = nums1[i];
                count++;
                if (count == 3)
                    return max;
            }
        }

        
        return nums1[0];
    }
}
