class Solution {
    public int smallestIndex(int[] nums) {
        int n=nums.length;
        for(int i=0;i<n;i++){
            int s=0;
            int x=nums[i];
            while(x>0){
                s+=x%10;
                x/=10;
            }
            if(i==s){
                return i;
            }
        }
        return -1;
    }
}