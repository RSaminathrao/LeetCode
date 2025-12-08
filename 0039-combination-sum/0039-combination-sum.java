class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        generate(candidates, 0, target, 0,new ArrayList<>(),ans);
        return ans;
    }
   void generate(int[] a, int index, int target, int s, List<Integer> container, List<List<Integer>> ans) 
   {
        if(index==a.length)        
        {
            if(s==target)    
                ans.add(new ArrayList<>(container));
            return;
        }
        if (s > target) 
            return;
        if(a[index]<=target)
        {
            container.add(a[index]);
            s+=a[index];
            generate(a, index, target, s, container, ans);
            container.remove(Integer.valueOf(a[index]));
            s-=a[index];
        }
        generate(a, index+1, target, s, container, ans);
    }
}