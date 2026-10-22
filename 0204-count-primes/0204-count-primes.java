class Solution {
    public int countPrimes(int n) {
        if(n<=2){
            return 0;
        }
        boolean iscomposite[]=new boolean[n];
        int c=n/2;
        for(int i=3;i*i<n;i+=2){
            if(!iscomposite[i]){
                for(int j=i*i;j<n;j+=2*i){
                    if(!iscomposite[j]){
                        iscomposite[j]=true;
                        c--;
                    }
                }
            }
        }
        return c;
    }
}