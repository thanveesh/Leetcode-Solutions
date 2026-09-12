class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
            char[] fres=s.toCharArray();
            char[] fret=t.toCharArray();
            Arrays.sort(fres);
            Arrays.sort(fret);
            return Arrays.equals(fres,fret);
        }
}