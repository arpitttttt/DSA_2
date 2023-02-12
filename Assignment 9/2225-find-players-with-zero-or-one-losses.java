class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        HashSet<Integer>set=new HashSet<>();
        HashMap<Integer,Integer>map=new HashMap<>(); 
        for(int i=0;i<matches.length;i++){
            set.add(matches[i][0]);
            map.put(matches[i][1],map.getOrDefault(matches[i][1],0)+1);
        }
        List<List<Integer>>a=new ArrayList<>();
        List<Integer>b=new ArrayList<>();
        List<Integer>c=new ArrayList<>();
        for(int i:set)
            if(!map.containsKey(i))
                b.add(i);
        Collections.sort(b);
        a.add(b);
        for(Map.Entry<Integer,Integer>m:map.entrySet())
            if(m.getValue()==1)
                c.add(m.getKey());
        Collections.sort(c);
        a.add(c);
        return (a);
    }
}