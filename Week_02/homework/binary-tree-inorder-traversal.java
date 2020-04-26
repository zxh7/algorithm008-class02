class Solution {
    List<Integer> ans=new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
        recur(root,ans);
        return ans;
    }
    public void recur(TreeNode root,List<Integer> ans){
       if(root==null)return;
       recur(root.left,ans);
       ans.add(root.val);
       recur(root.right,ans);
    }
}