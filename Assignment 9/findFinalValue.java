public class findFinalValue {
    public int findFinalValue(int[] nums, int original) {
        ArrayList<Integer>a=new ArrayList<>();
        for(int i:nums)
            a.add(i);
        for(int i=0;i<a.size();i++)
        {
            if(a.contains(original))
                original*=2;
            else
                break;
    }
        return original;
}
}
