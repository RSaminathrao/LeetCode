class Solution {
    public int[] twoSum(int[] nums, int target) {
      HashMap<Integer,Integer> mmp=new HashMap();
      for(int i=0;i<nums.length;i++)
      {
            int moreneeded=target-nums[i];
            if(mmp.containsKey(moreneeded))
                return new int[]{mmp.get(moreneeded),i};
            else
                mmp.put(nums[i],i);
      }
      return new int[]{-1,-1};  
    }
}