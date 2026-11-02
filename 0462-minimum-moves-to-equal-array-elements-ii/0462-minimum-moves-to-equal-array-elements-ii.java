class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int a=nums[nums.length/2];
        int c=0;
        for(int i=0;i<nums.length;i++){
            c+=Math.abs(a-nums[i]);
        }
        return c;
    }
}