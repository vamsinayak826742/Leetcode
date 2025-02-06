class Solution {
    public int maxSubArray(int[] nums) {
        int length=nums.length,current_sum=0,max_sum=0;
        int CurrentSum=nums[0];
        int MaximumSum=nums[0];
        for(int i=1;i<length;i++)
        {
            CurrentSum=Math.max(CurrentSum+nums[i],nums[i]);
            MaximumSum=Math.max(MaximumSum,CurrentSum);
            //System.out.println("i="+i+" CS="+CurrentSum+" MaximumSum="+MaximumSum);
        }   
        return MaximumSum;
    }
}