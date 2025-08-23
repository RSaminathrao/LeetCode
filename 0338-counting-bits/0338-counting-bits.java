class Solution {
    public int[] countBits(int n) {
        int a[] =new int[n+1];
        int k=0;
        for(int i=0;i<=n;i++)
        {
            int j=i;
            int c=0;
            while(j!=0)
            {
                j=j&(j-1);
                c++;
            }
            a[k++]=c;
        }
        return a;
    }
}