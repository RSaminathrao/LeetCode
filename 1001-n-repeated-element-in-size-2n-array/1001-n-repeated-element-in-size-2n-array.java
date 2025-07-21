class Solution {
    public int repeatedNTimes(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i:nums)
            map.merge(i,1,Integer::sum);
        for(Map.Entry<Integer,Integer> e:map.entrySet())
            if(e.getValue()==nums.length/2)
                return e.getKey();
        return 1;
    }
}