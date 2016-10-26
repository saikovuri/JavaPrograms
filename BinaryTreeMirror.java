package com.sai;

public class BinaryTreeMirror {
	
	Nodey root;
	void Mirror()
	{
		root = mirror(root);
	}

	public Nodey mirror(Nodey node)
	{
		if(node == null){
			return node;
		}
		Nodey left = mirror(node.left);
 		Nodey right = mirror(node.right);
 		node.left = right;
 		node.right = left;
		return node;
		
	}
	
	void inorder()
	{
		root = inOrder(root);
	}
	public Nodey inOrder(Nodey node){
		
		if(node == null){
			return node; 
		}
		
		inOrder(node.left);
		System.out.print(node.data + " ");
		inOrder(node.right);
		
		
		return node;
		
	}
	

	public static void main(String[] args) {
		BinaryTreeMirror btm = new BinaryTreeMirror();
		btm.root = new Nodey(1);
		btm.root.left = new Nodey(2);
		btm.root.right = new Nodey(3);
		btm.root.left.left = new Nodey(4);
		btm.root.left.right = new Nodey(5);
		btm.inorder();
		System.out.println(" ");
		btm.Mirror();
		btm.inorder();
	}
}

class Nodey{
	Nodey left;
	Nodey right;
	int data;
	
	Nodey(int data)
	{
		this.data = data;
		left = null;
		right = null;
	}
	public int ToString(){
		return data;
	}
	
}
