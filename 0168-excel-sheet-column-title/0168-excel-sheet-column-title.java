class Solution {
    public String convertToTitle(int columnNumber) {
        String t="";
        while(columnNumber>0){
            columnNumber--;
            char x=(char)('A'+columnNumber%26);
            t=x+t;
            columnNumber/=26;
        }
        return t;
    }
}