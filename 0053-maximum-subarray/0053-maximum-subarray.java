class Solution {
    public int maxSubArray(int[] nums) {
        int cs=nums[0];
        int maxs=nums[0];
        for(int i=1;i<nums.length;i++){
            cs=Math.max(cs+nums[i],nums[i]);
            maxs=Math.max(maxs,cs);
        }
        return maxs;
    }
}