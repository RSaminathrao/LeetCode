//memeoization way

class Solution {
    public int climbStairs(int n) {
       int dp[] =new int[n+1];
       Arrays.fill(dp,-1);
       return generate(dp,n); 
    }

    int generate (int[] dp,int n)
    {
        if(n<=1)
            return 1;
        else if(dp[n]!=-1)
            return dp[n];
        return dp[n]=generate(dp,n-1)+generate(dp,n-2);
    }
}