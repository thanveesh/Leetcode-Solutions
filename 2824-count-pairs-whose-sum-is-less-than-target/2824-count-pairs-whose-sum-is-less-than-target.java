class Solution {
    public int countPairs(List<Integer> nums, int target) {
        int c=0;
        for(int l=0;l<nums.size();l++){
            int r=l+1;
            while(r<nums.size()){
                if(nums.get(l)+nums.get(r)<target){
                    c++;
                }
                r++;
            }
        }
        return c;
    }
}