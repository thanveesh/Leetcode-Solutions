class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int c=0;
        for(int i:arr1){
            boolean cond=true;
            for(int j:arr2){
                if(Math.abs(i-j)<=d){
                    cond=false;
                    break;
                }
            }
            if(cond==true){
                c++;
            }
        }
        return c;
    }
}