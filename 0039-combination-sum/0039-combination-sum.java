//tuf approach 

class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        generate(candidates,0,target,new ArrayList<>(),ans);
        return ans;
    }
    void generate(int[] nums,int i,int target,List<Integer> l,List<List<Integer>> ans)
    {
        if(i==nums.length)
        {
            if(target==0)
                ans.add(new ArrayList<>(l));
            return ;
        }

        //pick
        if(nums[i]<=target)
        {
            target-=nums[i];
            l.add(nums[i]);
            generate(nums,i,target,l,ans);

            l.remove(l.size()-1);
            target+=nums[i];
        }
        generate(nums,i+1,target,l,ans);
    }
}