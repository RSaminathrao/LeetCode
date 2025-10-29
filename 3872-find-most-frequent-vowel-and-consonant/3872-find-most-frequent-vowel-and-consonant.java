class Solution {
    public int maxFreqSum(String s) {
        Map<Character,Integer> cm=new HashMap<>();
        Map<Character,Integer> vm=new HashMap<>();

        for(char c:s.toCharArray())
        {
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
                vm.put(c,vm.getOrDefault(c,0)+1);
            else
               cm.put(c,cm.getOrDefault(c,0)+1); 
        }

        int mc=0,mv=0;
        char mck='a',mvk='z';
        for(Map.Entry<Character,Integer> m:cm.entrySet())
        {
            if(mc<m.getValue())
            {
                mck=m.getKey();
                mc=m.getValue();
            }
                
        }

        for(Map.Entry<Character,Integer> m:vm.entrySet())
        {
            if(mv<m.getValue())
            {
                mvk=m.getKey();
                mv=m.getValue();
            }
                
        }

        return cm.getOrDefault(mck,0)+vm.getOrDefault(mvk,0);

    }
}