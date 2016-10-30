package com.sai;

public class QueueLinkedlist {
	QueueLink head = null;
	QueueLink tail = null;
	
	public void Enqueue(int data)
	{
		QueueLink newNode = new QueueLink(data);
		if(head == null && tail == null)
		{
			head = newNode;
			tail = newNode;
		}else{
			tail.next = newNode;
			tail = newNode;
		}
	}
	
	public void Dequeue()
	{
		if(head == null)
		{
			System.out.println("Queue is empty");
			return;
		}
		else
		{
			QueueLink dummy = head;
			dummy = head.next;
			head = dummy;
			
			
		}
	}
	
	public void display()
	{
		QueueLink dummy = head;
		System.out.println(dummy.data);
		while (dummy.next != null) {

			dummy = dummy.next;
			System.out.println(dummy.data);
		}
	}
	
	
	public static void main(String[] args) {
		
		QueueLinkedlist ql = new QueueLinkedlist();
		ql.Enqueue(4);
		ql.Enqueue(5);
		ql.Enqueue(6);
		ql.display();
		System.out.println("After Dequeue");
		ql.Dequeue();
		ql.Dequeue();
	
		ql.display();
	}

}

class QueueLink
{
	int data;
	QueueLink next;
	
	QueueLink(int data)
	{
		this.data = data;
	}
	
}