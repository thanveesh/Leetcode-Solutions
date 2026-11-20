class Solution {
    public int maxFreqSum(String s) {
        int[] freq=new int[26];
        for(char i:s.toCharArray()){
            freq[i-'a']++;
        }
        int maxv=0;
        int maxc=0;
        for(int i=0;i<26;i++){
            char c=(char)(i+'a');
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
                maxv=Math.max(maxv,freq[i]);
            }
            else{
                maxc=Math.max(maxc,freq[i]);
            }
        }
        return maxc+maxv;
    }
}