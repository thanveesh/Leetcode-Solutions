class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int ans[]=new int[2];
        int i=0;
        int j=numbers.length-1;
        while(i<j){
            int a=numbers[i]+numbers[j];
            if(a==target){
                ans[0]=i+1;
                ans[1]=j+1;
                break;
            }
            else if(a<target){
                i++;
            }
            else{
                j--;
            }
        }
        return ans;
    }
}