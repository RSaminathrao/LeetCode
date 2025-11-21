class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map=new HashMap<>();

        for(int i:nums)
            map.put(i,map.getOrDefault(i,0)+1);

        Queue<int[]> minheap=new PriorityQueue<>(
            (a,b)->{
                return a[0]-b[0];
            });

        for(Map.Entry<Integer,Integer> m:map.entrySet())
        {
            minheap.add(new int[]{m.getValue(),m.getKey()});

            if(minheap.size()>k)
                minheap.remove();

        }

        int[] ans=new int[k];
        int j=0;

        while(!minheap.isEmpty())
        {
            ans[j++]=minheap.remove()[1];
        }
           
        return ans;
        
    }
}