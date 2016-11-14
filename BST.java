package com.topcoder.easy;

import java.util.LinkedList;
import java.util.Queue;

public class BST {

	BS root;

	private BS TreeInsert(BS root, int data) {

		BS newNode = new BS(data);

		if (root == null) {
			root = newNode;

		} else if (data <= root.data) {
			root.left = TreeInsert(root.left, data);

		} else {
			root.right = TreeInsert(root.right, data);

		}

		return root;

	}

	private void inOrderTraversalTree(BS focusNode) {
		if (focusNode != null) {
			inOrderTraversalTree(focusNode.left);
			System.out.println(focusNode);
			inOrderTraversalTree(focusNode.right);
		}
	}

	public void preOrderTraversalTree(BS focusNode) {
		if (focusNode != null) {
			System.out.println(focusNode);
			preOrderTraversalTree(focusNode.left);
			preOrderTraversalTree(focusNode.right);
		}
	}

	public void postOrderTraversalTree(BS focusNode) {
		if (focusNode != null) {
			postOrderTraversalTree(focusNode.left);
			postOrderTraversalTree(focusNode.right);
			System.out.println(focusNode);
		}
	}

	public void levelOrderTraversalTree(BS focusNode) {
		if (focusNode == null) {
			return;
		}
		Queue<BS> q = new LinkedList<BS>();
		q.add(focusNode);
		while (!q.isEmpty()) {
			BS current = q.peek();
			System.out.println(current.data);
			if (current.left != null) {
				q.add(current.left);
			}

			if (current.right != null) {
				q.add(current.right);
			}
			q.remove();
		}
	}

	public BS findMin(BS node) {
		if (node == null) {
			System.out.println("Tree is empty");
			return null;
		}
		BS current = node;
		while (current.left != null) {
			current = current.left;
		}
		return current;
	}

	public int findHeight(BS node) {
		if (node == null) {
			return -1;
		}
		int leftHeight = findHeight(node.left);
		int rightHeight = findHeight(node.right);
		return (Math.max(leftHeight, rightHeight) + 1);

	}

	public int findMax(BS node) {
		if (node == null) {
			System.out.println("Tree is empty");
			return -1;
		}
		BS current = node;
		while (current.right != null) {
			current = current.right;
		}
		return current.data;
	}

	public boolean isBST() {
		return isBSTCheck(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
	}

	public boolean isBSTCheck(BS node, int min, int max) {

		if (node == null) {
			return true;
		}
		if (node.data < min || node.data > max) {
			return false;
		}

		return (isBSTCheck(node.left, min, node.data - 1)) && (isBSTCheck(node.right, node.data + 1, max));
	}

	@SuppressWarnings("unused")
	private int deleteNode(BS node, int data) {

		BS focusnode = node;
		BS parent = node;
		boolean isLeftChild = true;
		while (focusnode.data != data) {
			parent = focusnode;
			if (data < focusnode.data) {
				isLeftChild = true;
				focusnode = focusnode.left;
			}

			if (data > focusnode.data) {
				isLeftChild = false;
				focusnode = focusnode.right;
			}
		}

		if (focusnode == null) {
			return -1;
		}

		// If focusnode doesnot have any children

		if (focusnode.left == null && focusnode.right == null) {
			if (focusnode == node) {
				root = null;
			}

			if (isLeftChild) {
				parent.left = null;
			} else {
				parent.right = null;
			}
		}

		// If focusnode doesnt have left child

		else if (focusnode.left == null) {
			if (focusnode == root)
				root = focusnode.right;

			if (isLeftChild) {
				parent.left = focusnode.right;
			} else {
				parent.right = focusnode.right;
			}

		}

		// If focusnode doesnt have right child

		else if (focusnode.right == null) {
			if (focusnode == root)
				root = focusnode.left;

			if (isLeftChild) {
				parent.left = focusnode.left;
			} else {
				parent.right = focusnode.left;
			}

		}

		else {
			BS replacement = findMin(focusnode.right);
			focusnode.data = replacement.data;
			BS temp = focusnode;
			focusnode = replacement;
			parent = parent(temp.right, focusnode);
			parent.left = focusnode.left;

		}

		return data;
	}

	private BS parent(BS currentRoot, BS p) {
		if (currentRoot == null) {
			return null;
		} else {
			if (currentRoot.left == p || currentRoot.right == p)
				return currentRoot;
			else {
				if (currentRoot.data < p.data) {
					return parent(currentRoot.right, p);
				} else {
					return parent(currentRoot.left, p);
				}
			}
		}
	}

	public static void main(String[] args) {
		BST bs = new BST();
		bs.root = bs.TreeInsert(bs.root, 8);
		bs.root = bs.TreeInsert(bs.root, 4);
		bs.root = bs.TreeInsert(bs.root, 12);
		bs.root = bs.TreeInsert(bs.root, 2);
		bs.root = bs.TreeInsert(bs.root, 6);
		bs.root = bs.TreeInsert(bs.root, 10);
		bs.root = bs.TreeInsert(bs.root, 14);
		bs.root = bs.TreeInsert(bs.root, 1);
		bs.root = bs.TreeInsert(bs.root, 3);
		bs.root = bs.TreeInsert(bs.root, 5);
		bs.root = bs.TreeInsert(bs.root, 7);
		bs.root = bs.TreeInsert(bs.root, 9);
		bs.root = bs.TreeInsert(bs.root, 11);
		bs.root = bs.TreeInsert(bs.root, 13);
		bs.root = bs.TreeInsert(bs.root, 15);
		

		/*
		 * To verify BST or not // bs.root = new BS(4); // bs.root.left = new
		 * BS(8); // bs.root.right = new BS(5); // bs.root.left.left = new
		 * BS(1); // bs.root.left.right = new BS(3);
		 */

		System.out.println("Inorder Traversal");
		bs.inOrderTraversalTree(bs.root);
		System.out.println("PreOrder Traversal");
		bs.preOrderTraversalTree(bs.root);
		System.out.println("Postorder Traversal");
		bs.postOrderTraversalTree(bs.root);

		System.out.println("Minimum number is " + bs.findMin(bs.root));
		System.out.println("Minimum number is " + bs.findMax(bs.root));
		System.out.println("Height of the tree is " + bs.findHeight(bs.root));

		System.out.println("Levelorder Traversal");
		bs.levelOrderTraversalTree(bs.root);

		boolean bool = bs.isBST();
		if (bool) {
			System.out.println("Yes, it is a binary tree");
		} else {
			System.out.println("No, it is not a binary tree");
		}

		int m = bs.deleteNode(bs.root, 8);
		System.out.println("Removed element is " + m);
		System.out.println("Inorder Traversal");
		bs.inOrderTraversalTree(bs.root);

	}

}

class BS {

	int data;
	BS left;
	BS right;

	BS(int data) {
		this.data = data;
	}

	public String toString() {
		return data + "";

	}
}
