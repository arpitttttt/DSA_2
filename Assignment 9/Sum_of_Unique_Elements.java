class Sum_of_Unique_Elements {
    public int sumOfUnique(int[] nums) {
       int sum=0;
        for(int i=0;i<nums.length;i++)
            { 
                int count=0;
                for(int j=0;j<nums.length;j++)
                {
                  
                    if(nums[i]==nums[j])
                    count++;
                }
                    if(count==1)
                    sum+=nums[i];
                       }
        return sum;
    }
}