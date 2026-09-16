class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        int n=friends.length;
        int m=order.length;
        int x=0;
        int ans[]=new int[n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(order[i]==friends[j]){
                    ans[x]=order[i];
                    x++;
                }
            }
        }
        return ans;
    }
}