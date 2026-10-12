class Solution {
    public boolean checkIfPangram(String sentence) {
        Set<Character>a=new HashSet<>();
        for(int i=0;i<sentence.length();i++){
            a.add(sentence.charAt(i));
        }
        if(a.size()==26){
            return true;
        }
        return false;
    }
}