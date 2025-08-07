class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        ans.add(Arrays.asList(1));

        for(int i=1;i<numRows;i++)
        {
            List<Integer> row=new ArrayList<>();
            row.add(1);

            List<Integer> check=ans.get(i-1);

            for(int j=1;j<i;j++)
                row.add(check.get(j-1)+check.get(j));
            row.add(1);

            ans.add(row);

        }
        return ans;
    }
}