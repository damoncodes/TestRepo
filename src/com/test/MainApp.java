package com.test;

public class MainApp {

	public static void main(String[] args) {

		BST bst = new BST();
		bst.insert(40);
		bst.insert(25);
		bst.insert(78);
		bst.insert(10);
		bst.insert(3);
		bst.insert(17);
		bst.insert(32);
		bst.insert(30);
		bst.insert(38);
		bst.insert(78);
		bst.insert(50);
		bst.insert(93);
		bst.printInorder();
	}

}
