class Solution {
    public int sumOfPrimesInRange(int n) {
        int rev=0;
        int t=n;
        while(t>0){
            rev=rev*10+t%10;
            t/=10;   
        }
        int s=0;
        int m=Math.max(rev,n);
        int k=Math.min(rev,n);
        for(int i=k;i<=m;i++){
            if(i<2){
                continue;
            }
            boolean prime=true;
            for(int j=2;j*j<=i;j++){
                if(i%j==0){
                    prime=false;
                    break;
                }
            }
            if(prime){
                s+=i;
            }
        }
        return s;
    }
}