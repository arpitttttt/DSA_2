class Solution {
    public int countDistinctIntegers(int[] nums) {
        ArrayList<Integer>a=new ArrayList<>();
        for(int i=0;i<nums.length;i++)
            a.add(nums[i]);
        for(int i=0;i<nums.length;i++)
            a.add(rev(nums[i]));
        HashSet<Integer>set=new HashSet<>();
        int count=0;
        for(int i=0;i<a.size();i++)
            set.add(a.get(i));
        for(int i:set)
            count++;
        return count;
    }
    int rev(int no){
        int rev=0;
        while(no!=0){
            rev=rev*10+no%10;
            no/=10;
        }
        return rev;
    }
}