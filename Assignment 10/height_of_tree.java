public static int height(Node root) {
    if(root==null)
    return -1;
  return Math.max(height(root.left),height(root.right))+1;
}