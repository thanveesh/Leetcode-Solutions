class Solution {
    public int gcdOfOddEvenSums(int n) {
        int es=0,os=0;
        for(int i=1;i<=2*n;i++){
            if(i%2==0){
                es+=i;
            }
            else{
                os+=i;
            }
        }
        while(os!=0){
            int t=es;
            es=os;
            os=t%os;
        }
        return es;
    }
}