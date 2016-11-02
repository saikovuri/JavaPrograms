package com.topcoder.easy;


import java.util.Arrays;

public class QueueArray {
	int front = 0;
	int rear = 0;
	int maxsize = 5;

	int arr[] = new int[maxsize];

	public void Enqueue(int data) {

		if ((rear + 1) % maxsize == front) {
			throw new IllegalStateException("Queue is full");

		}
			else{
				
			arr[rear] = data;
			rear = (rear+1)% maxsize;

		} 
	}

	public void Dequeue() {
		if (front == rear) {
			System.out.println("Queue is empty");
			return;
		} else {
			System.out.println("Dequeued " + arr[front]);
			front = (front+1)%maxsize;
			
			
		}
	}

	 public void display() {
		 for(int i =0; i<rear;i++ )
		 {
			 System.out.println(arr[i]);
		 }
		 
		 
	    }
	 public String toString() {
	        return Arrays.toString(arr) ;
	    }

	public static void main(String[] args) {

		QueueArray qa = new QueueArray();
		qa.Enqueue(1);
		qa.Enqueue(2);
		qa.Enqueue(3);
		qa.Enqueue(4);
		qa.display();
		qa.Dequeue();
		qa.Dequeue();
		System.out.println("After inserting again");
		qa.Enqueue(3);
		qa.Enqueue(4);
		System.out.println(qa.toString());
		qa.Dequeue();
		
		qa.Dequeue();
		
		qa.Dequeue();
		
	

	}

}
