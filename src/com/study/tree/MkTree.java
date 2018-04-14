package com.study.tree;

public class MkTree {
	
	/**
	 * 构造普通二叉树
	 * 顺序存储结构一般只用于完全二叉树.存储深度为k却只有k个节点的树会造成空间的浪费，
	 * 详情参见《大话数据结构》第6.7.1章
	 * 
	 * 代码中index * 2，index * 2 + 1表示这棵树采用的是顺序存储的格式，表示传入的数组就是一颗完全二叉树
	 * 然后把这棵完全二叉树变成链式存储
	 * @param value
	 * @param index
	 * @return
	 */
	public static Node makeBinaryTreeByRecursion1(Integer[] values, int index) {
		if(index < values.length) {
			Integer value = values[index];
			if(value != null) {
				Node node = new Node(value);
				values[index] = null;
				//由于二叉树定义的严格， 所以用顺序结构也可以表现出二叉树的结构来，数组的下标需要从1开始来表示树
				//因此一个数组就对应这个一颗树，连续的数组可以组成一颗完全二叉树
				node.left = makeBinaryTreeByRecursion1(values, index * 2);
				node.right = makeBinaryTreeByRecursion1(values, index * 2 + 1);
				return node;
			}
		}
		return null;
	}
	
	//public static makeBinaryTreeBy

}
