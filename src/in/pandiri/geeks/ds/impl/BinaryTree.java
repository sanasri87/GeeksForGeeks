package in.pandiri.geeks.ds.impl;

public class BinaryTree {

	private BinaryTreeNode root;

	public BinaryTreeNode getRoot() {
		return root;
	}

	public void setRoot(BinaryTreeNode root) {
		this.root = root;
	}

	public static BinaryTreeNode createNode(Integer key) {

		BinaryTreeNode newNode = new BinaryTreeNode();
		newNode.setKey(key);
		return newNode;
	}
}