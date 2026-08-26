class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max=0;
        for(int i=0;i<candies.length;i++){
            if(max<candies[i]){
                max=candies[i];
            }
        }
        List<Boolean> ans=new ArrayList<>();
        for(int x:candies){
            ans.add(x+extraCandies>=max);
        }
        return ans;
    }
}