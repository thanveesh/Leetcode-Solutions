class Solution {
    public int smallestIndex(int[] nums) {
        int a=Integer.MAX_VALUE;
        int n=nums.length;
        for(int i=0;i<n;i++){
            int s=0;
            int x=nums[i];
            while(x>0){
                s+=x%10;
                x/=10;
            }
            if(i==s){
                a=Math.min(i,a);
            }
        }
        if(a==Integer.MAX_VALUE){
            return -1;
        }
        return a;
    }
}