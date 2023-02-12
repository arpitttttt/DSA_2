//one approach

public class  first_repeating{
    public int solve(ArrayList<Integer> a) {
        HashSet<Integer>set=new HashSet<>();
        int no=-1;
        for(int i=a.size()-1;i>=0;i--){
            if(set.contains(a.get(i)))
            no=a.get(i);
            else
            set.add(a.get(i));
        }
        return no;
    }
}

//second approach 

public class Solution {
    public int solve(ArrayList<Integer> a) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<a.size();i++){
            map.put(a.get(i),map.getOrDefault(a.get(i),0)+1);
         }
         for(int i=0;i<a.size();i++){
             if(map.get(a.get(i))>1)
             return a.get(i);
         }
         return -1;
    }
}
