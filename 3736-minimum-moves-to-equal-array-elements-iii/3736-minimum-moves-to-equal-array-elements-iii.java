class Solution {
    public int minMoves(int[] nums) {
        int max=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(max<nums[i]){
                max=nums[i];
            }
        }
        int c=0;
        for(int i=0;i<n;i++){
            c+=Math.abs(max-nums[i]);
        }
        return c;
    }
}