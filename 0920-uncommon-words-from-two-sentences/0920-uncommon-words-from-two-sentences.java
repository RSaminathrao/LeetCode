class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
         Map<String,Integer> map = new HashMap<>();
         for(String k : s1.split(" "))
         map.merge(k,1,Integer::sum);
         for(String k : s2.split(" "))
         map.merge(k,1,Integer::sum);
         List<String> list = new ArrayList<>();
         for(Map.Entry<String,Integer> e : map.entrySet())
         if(e.getValue() == 1)
         list.add(e.getKey());
         int i=0;
         String res[] = new String[list.size()];
         for(String k : list)
         res[i++] = k;

        return res;         

    }
}