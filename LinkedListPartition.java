package com.topcoder.easy;

import com.sai.Linkedlist;

public class LinkedListPartition {

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

	public void display() {
		ListNode dummy = head;

		while (dummy != null) {
			System.out.print(dummy + " -> ");
			dummy = dummy.next;

		}

	}
	
	void ReversePrint(ListNode head) {
	    if(head!= null)
	        {
	        ReversePrint(head.next);
	        System.out.println(head.data);
	    }
	    
	  
	}


	private ListNode partition(ListNode node, int n) {
		ListNode beforeStart = null;
		ListNode beforeEnd = null;
		ListNode afterStart = null;
		ListNode afterEnd = null;

		while (node != null) {

			ListNode next = node.next;
			node.next = null;

			if (node.data < n) {
				if (beforeStart == null) {
					beforeStart = node;
					beforeEnd = beforeStart;
				} else {
					beforeEnd.next = node;
					beforeEnd = node;
				}
			} else {
				if (afterStart == null) {
					afterStart = node;
					afterEnd = afterStart;
				} else {
					afterEnd.next = node;
					afterEnd = node;
				}
			}
			node = next;

		}
		if (beforeStart == null) {
			
			while(beforeStart!=null)
			{
				
				System.out.print(afterStart.data+" -> ");
				afterStart = afterStart.next;
			}
			
		}

		beforeEnd.next = afterStart;
		
		while(beforeStart!=null)
		{
			
			System.out.print(beforeStart.data);
			beforeStart = beforeStart.next;
			System.out.print(" -> ");
		}

		return beforeStart;

	}

	public static void main(String[] args) {
		LinkedListPartition list = new LinkedListPartition();
		list.addEnd(5);
		list.addEnd(8);
		list.addEnd(5);
		list.addEnd(10);
		list.addEnd(2);
		list.addEnd(1);
		list.addStart(3);
		list.display();
		System.out.println();
		list.partition(list.head, 5);
	list.ReversePrint(list.head);
		
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
