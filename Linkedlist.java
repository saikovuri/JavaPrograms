package com.sai;

public class Linkedlist {
	ListNode head = null;
	ListNode tail = null;
	int size = 0;

	public void addStart(int data) {

		ListNode newNode = new ListNode(data);
		if (head == null) {
			head = newNode;
			tail = newNode;
			size++;
		} else {
			newNode.next = head;
			head = newNode;
			size++;
		}

	}

	public void addEnd(int data) {

		ListNode newNode = new ListNode(data);
		if (tail == null) {
			head = newNode;
			tail = newNode;
			size++;
		} else {
			tail.next = newNode;
			tail = newNode;
			size++;

		}
	}

	public int addAtIndex(int data, int index) {
		if (index > size + 1 || index < 1) {
			System.out.println("Invalid position");
		}
		ListNode before = null;
		ListNode after = null;
		ListNode dummy = head;
		int count = 0;
		while (dummy.next != null) {
			count++;
			if (count == index - 1) {
				before = dummy;
			}

			dummy = dummy.next;

		}
		after = before.next;
		ListNode node = new ListNode(data);
		before.next = node;
		node.next = after;
		size++;
		return data;

	}

	public int Delete(int data) {
		ListNode start = head;
		ListNode before = null;
		while (start.data != data) {
			if (start.next == null) {
				System.out.println("Not existing");
			} else {

				before = start;
				start = start.next;
			}
		}
		if (start == head) {
			head = head.next;
			size--;
		} else {
			before.next = start.next;
			size--;
		}
		return start.data;

	}

	public int find(int val) {
		ListNode finder = head;
		while (finder.data != val) {
			if (finder.next == null) {
				return 0;
			} else {

				finder = finder.next;
			}
		}
		return finder.data;

	}

	public void display() {
		ListNode dummy = head;
		System.out.println(dummy);
		while (dummy.next != null) {

			dummy = dummy.next;
			System.out.println(dummy);
		}

	}

	public void displayReverse(ListNode head) {
		ListNode dummy = head;
		while (dummy != null) {
			System.out.println(dummy.data);
			dummy = dummy.next;

		}

	}

	public void ReverseList() {
		ListNode current = head;
		ListNode previous = null;
		ListNode next = null;

		while (current != null) {
			next = current.next;
			current.next = previous;
			previous = current;
			current = next;
		}
		System.out.println("After Reversing");
		displayReverse(previous);

	}

	public int Addafter(int data, int val) {
		ListNode dummy = head;
		ListNode previous = null;
		ListNode newNode = new ListNode(val);
		if (head.data == data) {
			newNode.next = head.next;
			head.next = newNode;
		} else {
			while (dummy.data != data) {
				dummy = dummy.next;
				previous = dummy;
			}
			newNode.next = previous.next;
			previous.next = newNode;
			size++;
		}
		return val;
	}

	public static void main(String[] args) {

		Linkedlist list = new Linkedlist();
		list.addEnd(4);
		list.addEnd(5);
		list.addEnd(6);
		list.addEnd(7);
		list.addEnd(8);
		list.addStart(2);

		System.out.println("before insertion");
		list.display();
		int z = list.addAtIndex(3, 2);

		System.out.println("after insertion of " + z);
		list.display();

		int x = list.Delete(3);
		System.out.println("after deletion of " + x);
		list.display();

		int y = list.find(5);
		if (x != 0) {
			System.out.println("Found " + y);
		} else {
			System.out.println("Not Found");
		}

		int m = list.Addafter(2, 3);
		System.out.println("After adding " + m);
		list.display();

		list.ReverseList();

	}

}

class ListNode {

	int data;
	ListNode next;

	ListNode(int data) {
		this.data = data;
	}

	public String toString() {
		return data + "";
	}

}
