package com.sai;

import java.util.EmptyStackException;

public class ArrayLinkedlist {
	ArrayNode top = null;

	public void push(int data) {
		ArrayNode newNode = new ArrayNode(data);
		newNode.next = top;
		top = newNode;
	}

	public void pop() {
		if (top == null) {
			return;
		}

		System.out.println("Element popped is" + top.data);
		top = top.next;
	}

	public void display() {
		ArrayNode dummy = top;
		while (dummy.next != null) {
			System.out.println(dummy.data);
			dummy = dummy.next;
		}
		System.out.println(dummy.data);
	}

	public static void main(String[] args) {

		ArrayLinkedlist al = new ArrayLinkedlist();
		al.push(1);
		al.push(2);
		al.push(3);
		al.push(4);
		al.display();
		al.pop();

		System.out.println("After popping");
		al.display();
	}

}

class ArrayNode {
	int data;
	ArrayNode next;

	ArrayNode(int data) {
		this.data = data;
	}

}
