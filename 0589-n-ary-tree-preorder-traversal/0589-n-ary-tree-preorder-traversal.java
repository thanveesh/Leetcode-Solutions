/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<Integer> preorder(Node root) {
        List<Integer>a=new ArrayList<>();
        if(root==null){
            return a;
        }
        Stack<Node>s=new Stack<>();
        s.push(root);
        while(!s.isEmpty()){
            Node x=s.pop();
            a.add(x.val);
            for(int i=x.children.size()-1;i>=0;i--){
                s.push(x.children.get(i));
            }
        }
        return a;
    }
}