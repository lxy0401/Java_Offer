package RebuildTree;

import java.util.Arrays;

/**
 * @author LXY
 * @email 403824215@qq.com
 * @date 2018/7/17 17:21
 */
//输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树。
// 假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
// 例如输入前序遍历序列{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}，则重建二叉树并返回。

//二叉树先序遍历的性质：第一个为根节点
//二叉树中序遍历的性质：找到根节点，根节点左边的序列为左子树的中序遍历结果，根节点的右边序列为右子树的中序遍历结果
public class Solution {
    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        if(pre.length == 0 || in.length == 0)
        {
            return null;
        }
        TreeNode root = new TreeNode(pre[0]);
        for(int i = 0;i < in.length;i++)
        {
            if(in[i] == pre[0])
            {
                //在中序中找到根节点
                root.left = reConstructBinaryTree(
                        Arrays.copyOfRange(pre,1,i + 1),
                        Arrays.copyOfRange(in,0,i));
                root.right = reConstructBinaryTree(
                        Arrays.copyOfRange(pre,i + 1,pre.length),
                        Arrays.copyOfRange(in,i + 1,in.length));
            }
        }
        return root;
    }
}
