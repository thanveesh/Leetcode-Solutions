class Solution {
    public int maxLength(int[] nums) {
        int n=nums.length;
        int ans=0;
        for(int i=0;i<n;i++){
            long pro=1;
            long g=nums[i];
            long l=nums[i];
            for(int j=i;j<n;j++){
                pro*=nums[j];
                g=gcd(g,nums[j]);
                l=l/gcd(l,nums[j])*nums[j];
                if(pro==l*g){
                    ans=Math.max(ans,j-i+1);
                }
            }
        }
        return ans;
    }
    private long gcd(long a,long b){
        while(b!=0){
            long temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
}