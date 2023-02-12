class Solution {
    ArrayList<Integer>a=new ArrayList<>();
public List<Integer> preorderTraversal(TreeNode root) {
   inOrder(root,a);
   return a;
}
public void inOrder(TreeNode root,ArrayList<Integer>a){
   if(root==null)
       return ;
   a.add(root.val);
   inOrder(root.left,a);
   inOrder(root.right,a);
}
}