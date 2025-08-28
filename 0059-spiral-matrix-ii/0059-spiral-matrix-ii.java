class Solution {
    public int[][] generateMatrix(int n) {
        int ans[][] =new int[n][n];

        int c=1;

        int rowbegin=0;
        int rowend=ans.length-1;
        int colbegin=0;
        int colend=ans[0].length-1;

        while(rowbegin<=rowend && colbegin<=colend)
        {
            //traverse right
            for(int j=colbegin;j<=colend;j++)
                ans[rowbegin][j]=c++;
            
            rowbegin++;

            //traverse down
            for(int i=rowbegin;i<=rowend;i++)
                ans[i][colend]=c++;

            colend--;

            //traverse left
            if(rowbegin<=rowend)
            {
                for(int j=colend;j>=colbegin;j--)
                    ans[rowend][j]=c++;
            }

            rowend--;

            //traverse top
            if(colbegin<=colend)
            {
                for(int i=rowend;i>=rowbegin;i--)
                    ans[i][colbegin]=c++;
            }

            colbegin++;
        }
        return ans;
    }
}