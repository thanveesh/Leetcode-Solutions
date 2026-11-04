class Solution {
    public int dominantIndex(int[] nums) {
        int max=0;
        int a=0;
        for(int i=0;i<nums.length;i++){
            if(max<nums[i]){
                max=nums[i];
                a=i;
            }
        }
        for(int i=0;i<nums.length;i++){
            if(i==a){
                continue;
            }
            else if(2*nums[i]>max){
                a=-1;
            }
        }
        return a;
    }
}