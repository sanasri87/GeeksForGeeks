package in.pandiri.geeks.ds.impl;

public class BinarySearchTree extends BinaryTree {

	public static int height(BinaryTreeNode root) {

		if (root == null
				|| (root.getLeftChild() == null && root.getRightChild() == null)) {
			return 0;
		}
		return 1 + Math.max(height(root.getLeftChild()),
				height(root.getRightChild()));
	}

	public static int level(BinaryTreeNode root, Integer key) {

		if (root == null || (root.getKey().compareTo(key) == 0)) {
			return 0;
		}
		return 0;
	}

	public static BinaryTreeNode search(BinaryTreeNode root, Integer key) {

		if (root != null) {
			if (root.getKey().compareTo(key) == 0) {
				return root;
			} else if (root.getKey().compareTo(key) >= 0) {
				return search(root.getLeftChild(), key);
			} else {
				return search(root.getRightChild(), key);
			}
		}
		return null;
	}

	public static void insert(BinaryTreeNode root, Integer key) {

		BinaryTreeNode newNode = BinarySearchTree.createNode(key);
		if (key <= root.getKey()) {

		}
	}

	public void delete(Integer key) {

		// TODO:
	}

	public static void inOrder(BinaryTreeNode root) {

		if (root == null) {
			return;
		}
		inOrder(root.getLeftChild());
		System.out.print(root.getKey() + ",  ");
		inOrder(root.getRightChild());
	}

	public static void postOrder(BinaryTreeNode root) {

		if (root == null) {
			return;
		}
		postOrder(root.getLeftChild());
		postOrder(root.getRightChild());
		System.out.print(root.getKey() + ",  ");
	}

	public static void preOrder(BinaryTreeNode root) {

		if (root == null) {
			return;
		}
		System.out.print(root.getKey() + ",  ");
		preOrder(root.getLeftChild());
		preOrder(root.getRightChild());
	}
}