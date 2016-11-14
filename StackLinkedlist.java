package com.sai;

import java.util.EmptyStackException;

public class StackLinkedlist {
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

		StackLinkedlist sl = new StackLinkedlist();
		sl.push(1);
		sl.push(2);
		sl.push(3);
		sl.push(4);
		sl.display();
		sl.pop();

		System.out.println("After popping");
		sl.display();
	}

}

class ArrayNode {
	int data;
	ArrayNode next;

	ArrayNode(int data) {
		this.data = data;
	}

}
