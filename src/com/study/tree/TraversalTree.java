package com.study.tree;

import java.util.ArrayDeque;
import java.util.Queue;

public class TraversalTree {
	
	
	/**
	 * 层次遍历，且换行打印
	 * @param root
	 */
	public static void levelTraversal(Node root) {
		if(root.value != null) {
			System.out.println("层次遍历");
			//记录当前行的最后一个
			Node last = root;
			//跟踪每一个入栈的节点
			Node nlast = root;
			Queue<Node> queue = new ArrayDeque<Node>();
			queue.add(root);
			while (!queue.isEmpty()) {
				Node current = queue.poll();
				System.out.print(current.value);
				if (current.left != null) {
					queue.add(current.left);
					nlast = current.left;
				}
				if (current.right != null) {
					queue.add(current.right);
					nlast = current.right;
				}
				if (last == current) {
					System.out.println();
					last = nlast;
				}
			}
		}
	}
	
}
