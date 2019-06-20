package com.lc.practice.bfs;

import static org.junit.Assert.*;

import org.junit.Test;

public class BinaryTreeTest
{

    // Test case number: 1
    // Test case values: tree 
    //    1
    //  2     3
    //4   5
    // Expected output (Post-state): "12345"

    @Test
    public void testcase1()
    {
	// GIVEN
	BinaryTree tree_level = new BinaryTree();
	tree_level.root = new TreeNode(1);
	tree_level.root.left = new TreeNode(2);
	tree_level.root.right = new TreeNode(3);
	tree_level.root.left.left = new TreeNode(4);
	tree_level.root.left.right = new TreeNode(5);
	String expected = "12345";

	// WHEN
	String result = tree_level.printTreeBFS();
	// THEN
	assertEquals(expected, result);
    }

}
