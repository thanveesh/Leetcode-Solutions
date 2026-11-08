class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer>a=new HashSet<>();
        Set<Integer>b=new HashSet<>();
        for(int i:nums1){
            a.add(i);
        }
        for(int i:nums2){
            b.add(i);
        }
        List<Integer>x=new ArrayList<>();
        List<Integer>y=new ArrayList<>();
        for(int i:a){
            if(!b.contains(i)){
                x.add(i);
            }
        }
        for(int i:b){
            if(!a.contains(i)){
                y.add(i);
            }
        }
        List<List<Integer>>ans=new ArrayList<>();
        ans.add(x);
        ans.add(y);
        return ans;
    }
}