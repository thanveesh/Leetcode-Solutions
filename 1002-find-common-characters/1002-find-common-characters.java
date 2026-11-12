class Solution {
    public List<String> commonChars(String[] words) {
        int minfreq[]=new int[26];
        Arrays.fill(minfreq,Integer.MAX_VALUE);
        for(String w:words){
            int freq[]=new int[26];
            for(char ch:w.toCharArray()){
                freq[ch-'a']++;
            }
            for(int i=0;i<26;i++){
                minfreq[i]=Math.min(minfreq[i],freq[i]);
            }
        }
        List<String>ans=new ArrayList<>();
        for(int i=0;i<26;i++){
            while(minfreq[i]>0){
                ans.add(String.valueOf((char)(i+'a')));
                minfreq[i]--;
            }
        }
        return ans;
    }
}