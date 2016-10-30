package com.sai;

import java.util.Scanner;

public class StackArray {

	public static void main(String[] args) {
		System.out.println("Enter the size of the stack");
		Scanner scan = new Scanner(System.in);
		int s = scan.nextInt();
		Stack st = new Stack(s);
		int choice;
		do {
			System.out.println("\n \n1.Push\n2.Pop\n3.Display\n4.Exit\n");
			System.out.println("Enter selection");
			choice = scan.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter element to push");
				int in = scan.nextInt();
				st.push(in);
				break;
			case 2:
				st.pop();
				break;
			case 3:
				st.display();
				break;
			}

		} while (choice != 4);
	}
}

class Stack {
	int size;
	int[] items;
	int top;

	Stack(int str) {
		top = -1;
		size = str;
		items = new int[str];
	}

	public void display() {
		if (top != -1) {
			for (int i = 0; i <= top; i++) {
				System.out.println(items[i]);
			}
		}

	}

	public void pop() {
		if (top == -1) {
			System.out.println("Stack is empty");
		} else {
			System.out.println("Popped item is" + items[top]);
			top--;
		}

	}

	public void push(int i) {
		if (top == size - 1) {
			System.out.println("Stack is full");
		} else {
			top++;
			items[top] = i;
			System.out.println("Pushed item is" + items[top]);

		}

	}

}