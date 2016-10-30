package com.sai;
import java.util.Arrays;

public class QueueArray {
	int front = -1;
	int rear = -1;
	int size;
	int maxsize = 4;

	int arr[] = new int[maxsize];

	public void Enqueue(int data) {

		if ((rear + 1) % maxsize == front) {
			throw new IllegalStateException("Queue is full");

		}
		if (front == -1 && rear == -1) {
			front++;
			rear++;
			arr[rear] = data;
			size++;

		} else {
			rear = (rear+1)% maxsize;
			arr[rear] = data;
		}
	}

	public void Dequeue() {
		if (front == -1 && rear == -1) {
			 throw new IllegalStateException("Queue is empty, cant dequeue");
		} else if (front == rear) {
			System.out.println("Dequeued " + arr[front]);
			front = -1;
			rear = -1;
			size--;

		} else {
			System.out.println("Dequeued " + arr[front]);
			front = (front+1)%maxsize;
			size--;
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
		System.out.println(qa.toString());
		qa.Dequeue();
		qa.Dequeue();
		qa.Dequeue();
		System.out.println("After Insertion of 2 in the front");
		qa.Enqueue(2);
		System.out.println(qa.toString());
	

	}

}
