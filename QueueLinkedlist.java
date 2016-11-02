package com.sai;

public class QueueLinkedlist {
	QueueLink head = null;
	QueueLink tail = null;

	public void Enqueue(int data) {
		QueueLink newNode = new QueueLink(data);
		if (head == null) {
			head = newNode;
			tail = head;
		} else {
			tail.next = newNode;
			tail = newNode;

		}
	}

	public int Dequeue() {
		if (head == null) {
			System.out.println("Queue is empty");
			return -1;
		} else {
			QueueLink dummy = head;
			head = head.next;
			return dummy.data;
		}
	}

	public void display() {
		QueueLink dummy = head;

		while (dummy != null) {
			System.out.println(dummy.data);
			dummy = dummy.next;

		}
	}

	public static void main(String[] args) {

		QueueLinkedlist ql = new QueueLinkedlist();
		ql.Enqueue(4);
		ql.Enqueue(5);
		ql.Enqueue(6);
		ql.display();
		System.out.println("After Dequeue");
		System.out.println("Popped " + ql.Dequeue());
		System.out.println("Popped " + ql.Dequeue());
		System.out.println("Popped " + ql.Dequeue());
		System.out.println("Popped " + ql.Dequeue());
		ql.display();
	}

}

class QueueLink {
	int data;
	QueueLink next;

	QueueLink(int data) {
		this.data = data;
	}

}