package com.sai;

public class Binarytree {

	Node root;

	public void addNode(int key, String name) {
		Node newNode = new Node(key, name);
		if (root == null) {
			root = newNode;
		} else {
			Node focusNode = root;
			Node parent;
			while (true) {
				parent = focusNode;
				if (key < focusNode.key) {
					focusNode = focusNode.leftchild;

					if (focusNode == null) {
						parent.leftchild = newNode;
						return;
					}
				} else {
					focusNode = focusNode.rightchild;
					if (focusNode == null) {
						parent.rightchild = newNode;
						return;
					}

				}
			}

		}

	}

	public void inOrderTraversalTree(Node focusNode) {
		if (focusNode != null) {
			inOrderTraversalTree(focusNode.leftchild);
			System.out.println(focusNode);
			inOrderTraversalTree(focusNode.rightchild);
		}
	}

	public Node findNode(int key) {
		Node focusNode = root;

		while (focusNode.key != key) {
			if (key < focusNode.key) {
				focusNode = focusNode.leftchild;
			} else {
				focusNode = focusNode.rightchild;
			}
			if (focusNode == null) {
				return null;
			}
		}

		return focusNode;
	}

	public static void main(String[] args) {

		Binarytree theTree = new Binarytree();
		theTree.addNode(10, "sai");
		theTree.addNode(40, "rakesh");
		theTree.addNode(30, "ravi");
		theTree.addNode(50, "abhinav");
		theTree.addNode(20, "raghu");
		theTree.addNode(60, "vinay");

		theTree.inOrderTraversalTree(theTree.root);
		System.out.println("Search for 30");
		System.out.println(theTree.findNode(30));

	}

}

class Node {

	int key;
	String name;
	Node leftchild;
	Node rightchild;

	Node(int key, String name) {
		this.key = key;
		this.name = name;
	}

	public String toString() {
		return key + " name is " + name;

	}
}