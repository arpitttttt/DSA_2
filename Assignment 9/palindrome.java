public class palindrome {
        public int solve(String a) {
            boolean even=false;
            HashMap<Character,Integer>map=new HashMap<>();
            for(int i=0;i<a.length();i++)
            map.put(a.charAt(i),map.getOrDefault(a.charAt(i),0)+1);
            int odd=0;
            for(Map.Entry<Character,Integer>m:map.entrySet()){
                if(m.getValue()%2!=0)
                odd++;
            }
            if(odd<=1)
            return 1;
            else
            return 0;
        }
    }
    
}
