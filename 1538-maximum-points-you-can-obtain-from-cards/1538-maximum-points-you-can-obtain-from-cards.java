class Solution {
    public int maxScore(int[] cardPoints, int k) {
       int sum=0 ,j=cardPoints.length-1;
       for(int i=0;i<k;i++)
            sum=sum+cardPoints[i];

        int maxsum=sum;

        for(int i=k-1;i>=0;i--)
        {
            sum=sum-cardPoints[i];
            sum=sum+cardPoints[j--];

            maxsum=Math.max(sum,maxsum);
        }

    return maxsum;
    }
}