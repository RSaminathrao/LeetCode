class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans=new ArrayList<>();

        int rowbegin=0;
        int rowend=matrix.length-1;
        int colbegin=0;
        int colend=matrix[0].length-1;

        while(rowbegin<=rowend && colbegin<=colend)
        {
            //traverse right
            for(int j=colbegin;j<=colend;j++)
                ans.add(matrix[rowbegin][j]);
            
            rowbegin++;

            //traverse down
            for(int i=rowbegin;i<=rowend;i++)
                ans.add(matrix[i][colend]);

            colend--;

            //traverse left
            if(rowbegin<=rowend)
            {
                for(int j=colend;j>=colbegin;j--)
                    ans.add(matrix[rowend][j]);
            }

            rowend--;

            //traverse top
            if(colbegin<=colend)
            {
                for(int i=rowend;i>=rowbegin;i--)
                    ans.add(matrix[i][colbegin]);
            }

            colbegin++;
        }
        return ans;
    }
}