class Solution {
    public boolean isPalindromic(String s) {
        StringBuilder ans =new StringBuilder();
        for(int k=0;k<s.length();k++){
            int x=(int)s.charAt(k);
            String b=Integer.toBinaryString(x);
           while(b.length()<8){
               b="0"+b;
           }
            ans.append(b);
        }
        int i=0;
        int j=ans.length()-1;
        while(i<j){
            if(ans.charAt(i)!=ans.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}