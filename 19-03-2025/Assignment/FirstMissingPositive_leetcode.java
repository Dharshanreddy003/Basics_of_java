class FirstMissingPositive_leetcode 
{
    public int firstMissingPositive(int[] nums) 
    {
        Arrays.sort(nums);
        int target =1;
        for(int i =0;i<nums.length;i++)
        {
            if(nums[i]== target)
            {
                target++;
            }
            else if(nums[i]> target)
            {
                return target;
            }
        }
        return target;
    }
}