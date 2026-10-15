class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int c=0;
        for(int i=low;i<=high;i++){
            String s=String.valueOf(i);
            int n=s.length();
            if(n%2!=0){
                continue;
            }
            int l=0,r=0;
            for(int j=0;j<n/2;j++){
                l+=s.charAt(j)-'0';
            }
            for(int j=n/2;j<n;j++){
                r+=s.charAt(j)-'0';
            }
            if(l==r){
                c++;
            }
        }
        return c;
    }
}