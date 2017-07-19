package com.test;

public class BST {

	public Node root;
	public String msg="This is a change";

	public void insert(int value) {
		Node node = new Node(value);
		if (root == null) {
			root = node;
			return;
		}

		insertRec(root, node);

	}

	private void insertRec(Node currentNode, Node node) {

		if (currentNode.value > node.value) {
			if (currentNode.left == null)
				currentNode.left = node;

			else
				insertRec(currentNode.left, node);
		}

		else if (currentNode.right == null)
			currentNode.right = node;
		else
			insertRec(currentNode.right, node);

	}

	public void printInorder() {
		printInOrderRec(root);
		System.out.println("");
	}

	private void printInOrderRec(Node currRoot) {
		if (currRoot == null) {
			return;
		}
		printInOrderRec(currRoot.left);
		System.out.print(currRoot.value + ", ");
		printInOrderRec(currRoot.right);
	}

}
