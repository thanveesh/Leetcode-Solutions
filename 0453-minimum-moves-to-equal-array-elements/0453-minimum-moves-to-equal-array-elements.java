class Solution {
    public int minMoves(int[] nums) {
        int s=0;
        int min=Integer.MAX_VALUE;
        for(int i:nums){
            min=Math.min(min,i);
            s+=i;
        }
        return s-(min*nums.length);
    }
}