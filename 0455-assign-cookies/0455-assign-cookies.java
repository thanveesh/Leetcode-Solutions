class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int c=0;
        Arrays.sort(g);
        Arrays.sort(s);
        int cookie=0;
        while(cookie<s.length&&c<g.length){
            if(s[cookie]>=g[c]){
                c++;
            }
            cookie++;
        }
        return c;
    }
}