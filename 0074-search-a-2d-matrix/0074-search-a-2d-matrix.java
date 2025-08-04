class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
       int r=matrix.length;
       int c=matrix[0].length;

       int start=0;
       int end=r*c-1;

       while(start<=end)
       {
            int mid=(start+end)/2;
            int mr=mid/c;
            int mc=mid%c;
            if(matrix[mr][mc]==target)
                return true;
            else if(matrix[mr][mc]<target)
                start=mid+1;
            else
                end=mid-1;
       }
       return false; 
    }
}