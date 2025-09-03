class Solution {
    public int[] nextGreaterElements(int[] nums) {
       int n=nums.length;
       int[] ans=new int[n];
       Stack<Integer> stk=new Stack<>();

       for(int i=2*n-1;i>=0;i--)
       {
            if(stk.isEmpty())
            {
                stk.push(nums[i%n]);
                if(i<n)
                    ans[i]=-1;
            }

            else
            {
                if(stk.peek()>nums[i%n])
                {
                    if(i<n)
                        ans[i]=stk.peek();
                    stk.push(nums[i%n]);  
                }
                else
                {
                    while(!stk.isEmpty())
                    {
                        if(stk.peek()>nums[i%n])
                            break;
                        stk.pop();
                    }
                    if(stk.isEmpty()&&i<n)
                        ans[i]=-1;
                    else if(i<n)
                        ans[i]=stk.peek();
                    stk.push(nums[i%n]);
                }
            }
       }
       return ans; 
    }
}