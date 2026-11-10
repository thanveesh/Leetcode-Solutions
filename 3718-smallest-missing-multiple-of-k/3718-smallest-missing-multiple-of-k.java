class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashSet<Integer>s=new HashSet<>();
        for(int i:nums){
            s.add(i);
        }
        int m=k;
        while(s.contains(m)){
            m+=k;
        }
        return m;
    }
}