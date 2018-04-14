package com.study.tree;

public class BinaryTreeStudy {
	public static void main(String[] args) {
		Integer[] v = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		// Node node = new Node(v);
		// System.out.println(node.value);
		BinaryTree tree = new BinaryTree(v);
		TraversalTree.levelTraversal(tree.root);
	}
}

class Node {
	Node left = null;
	Node right = null;
	Integer value = null;

	public Node(Integer value) {
		this.value = value;
	}
}

class BinaryTree {
	Node root;

	public BinaryTree(Integer[] values) {
		//从1开始是因为传入的是一个数组结构的二叉树，二叉树的节点从1开始，
		//所以数组的第一个不应该放值，即使放了也没关系，这样就成了只有左子树的二叉树，这样就不叫做完全二叉树了
		this.root = MkTree.makeBinaryTreeByRecursion1(values, 1);
	}

}
