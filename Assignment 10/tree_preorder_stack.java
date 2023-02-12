class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer>a=new ArrayList<>();
        Stack<TreeNode>s=new Stack();
        s.push(root);
        while(s.isEmpty()!=true){
            TreeNode currNode = s.pop();
            if(currNode!=null){
                a.add(currNode.val);
                s.push(currNode.right);
                s.push(currNode.left);
            }
        }
        return a;
    }
}