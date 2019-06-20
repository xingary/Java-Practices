package com.lc.practice.bfs;

import java.util.LinkedList;
import java.util.Queue;

class TreeNode
{
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x)
    {
	val = x;
    }
}

public class BinaryTree
{
    TreeNode root;

    public String printTreeBFS()
    {
	StringBuilder result = new StringBuilder();
	Queue<TreeNode> queue = new LinkedList<TreeNode>();

	queue.add(root);

	while (!queue.isEmpty())
	{
	    TreeNode tempNode = queue.poll();
	    result.append(tempNode.val);
	    if (tempNode.left != null)
	    {
		queue.add(tempNode.left);
	    }
	    if (tempNode.right != null)
	    {
		queue.add(tempNode.right);
	    }
	}
	return result.toString();
    }

}
