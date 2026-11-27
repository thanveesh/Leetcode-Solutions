class Solution {
    public int sumOfUnique(int[] nums) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int s=0;
        for(int i:nums){
            if(map.get(i)==1){
                s+=i;
            }
        }
        return s;
    }
}