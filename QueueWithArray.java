package com.sai;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

class QueueNew {

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	int items[];
	int front = 0, rear = 0, size, count = 0;

	void getData() {
		try {
			System.out.println("Enter the Limit :");
			size = Integer.parseInt(br.readLine());
			items = new int[size];
		} catch (Exception e) {

			System.out.println(e.getMessage());
		}
	}

	void enqueue() {
		try {

			if (count < size) {
				System.out.println("Enter a number to queue");
				int i = Integer.parseInt(br.readLine());
				items[rear] = i;
				rear++;
				count++;
			} else {
				System.out.println("Queue is full");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	void dequeue() {
		try {

			if (count != 0) {
				System.out.println("Deleted Item is:" + items[front]);
				front++;
				count--;
			} else {
				System.out.println("Queue is empty");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());

		}

	}

	void display() {
		int m = 0;
		if (count == 0) {
			System.out.println("Queue is empty");
		}

		else {
			System.out.println("Elements are");
			for (int i = front; m < count; i++, m++) {

				System.out.println(items[i]);
			}
		}

	}

}

public class QueueWithArray {

	public static void main(String[] args) {
		QueueNew q = new QueueNew();
		q.getData();
		System.out.println("Enter element");
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int choice;

		do {
			System.out.println("1.Enqueue\n2.Dequeue\n3.Display\n4.Exit\n");
			System.out.println("Enter the Choice : ");
			choice = scan.nextInt();
			switch (choice) {
			case 1:
				q.enqueue();
				break;
			case 2:
				q.dequeue();
				break;
			case 3:
				q.display();
				break;
			}

		} while (choice != 3);
	}

}
