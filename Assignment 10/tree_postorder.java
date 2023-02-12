class Solution {
    ArrayList<Integer>a=new ArrayList<>();
 public List<Integer> postorderTraversal(TreeNode root) {
     post(root,a);
     return a;
 }
 public void post(TreeNode root,ArrayList<Integer>a){
     if(root==null)
         return ;
     post(root.left,a);
     post(root.right,a); 
     a.add(root.val);
 }
}