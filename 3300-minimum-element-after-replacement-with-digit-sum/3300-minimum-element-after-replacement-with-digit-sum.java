class Solution {
    public int minElement(int[] nums) {
        int a[]=new int[nums.length];
        int min=nums[0];
        for(int i=0;i<nums.length;i++){
            int x=nums[i];
            int d=0;
            while(x>0){
                d=d+x%10;
                x/=10;
            }
            a[i]=d;
        }
            for(int j:a){
                if(min>j){
                    min=j;
                }
            }
        return min;
    }
}