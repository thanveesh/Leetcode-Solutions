class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer>st=new Stack<>();
        for(String i:operations){
            if(i.equals("+")){
                int t=st.pop();
                int s=st.pop();
                int sum=t+s;
                st.push(s);
                st.push(t);
                st.push(sum);
            }
            else if(i.equals("D")){
                st.push(st.peek()*2);
            }
            else if(i.equals("C")){
                st.pop();
            }
            else{
                st.push(Integer.parseInt(i));
            }
        }
        int total=0;
        while(!st.isEmpty()){
            total+=st.pop();
        }
        return total;
    }
}