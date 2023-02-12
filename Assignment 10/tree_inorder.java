class Solution {
    ArrayList<Integer>a=new ArrayList<>();
public List<Integer> inorderTraversal(TreeNode root) {
    inOrder(root,a);
    return a;
}
public void inOrder(TreeNode root,ArrayList<Integer>a){
    if(root==null)
        return ;
    inOrder(root.left,a);
    a.add(root.val);
    inOrder(root.right,a);
} 
}