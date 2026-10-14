class Solution {
    public String convertToBase7(int num) {
        if(num==0){
            return "0";
        }
        long n=Math.abs((long)num);
        String ans="";
        while(n>0){
            ans=(n%7)+ans;
            n/=7;
        }
        if(num<0){
            ans="-"+ans;
        }
        return ans;
    }
}