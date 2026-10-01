class Solution {
    public boolean isValid(String s) {
        if(s.length()<2){
            return false;
        }
        Stack<Character>a=new Stack<>();
        for(int i=0;i<s.length();i++){
            char x=s.charAt(i);
            if(x=='('||x=='{'||x=='['){
                a.push(s.charAt(i));
            }
            else{
                if(a.isEmpty()){
                    return false;
                }
                char y=a.pop();
                if(x==')'&&y!='('||x=='}'&&y!='{'||x==']'&&y!='['){
                    return false;
                }
            }
        }
        return a.isEmpty();

    }
}