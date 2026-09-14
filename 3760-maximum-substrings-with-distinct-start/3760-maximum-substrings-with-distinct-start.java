class Solution {
    public int maxDistinct(String s) {
        int i=0;
        HashSet<Character>ans=new HashSet<>();
        while(i<s.length()){
            if(!ans.contains(s.charAt(i))){
                ans.add(s.charAt(i));
            }
            i++;
        }
        return ans.size();
    }
}