package com.topcoder.easy;

import java.util.Stack;

public class MinStack {
	int minEle = 0;
	Stack<Integer> s = new Stack<Integer>();

	void push(int data) {
		if (s.isEmpty()) {
			minEle = data;
			s.push(data);
			System.out.println("Number inserted is " + data);
			return;
		}

		if (data < minEle) {
			s.push(2 * data - minEle);
			minEle = data;
			System.out.println("Number inserted is " + data);
		} else {
			s.push(data);
			System.out.println("Number inserted is " + data);

		}

	}

	void pop() {
		if (s.isEmpty()) {
			System.out.println("Stack has no elements");
		}

		Integer t = s.pop();
		if (t < minEle) {
			System.out.println(minEle);
			minEle = 2 * minEle - t;

		} else {
			System.out.println(t);

		}

	}

	void getMin() {
		if (s.isEmpty()) {
			System.out.println("Stack is empty");
		} else {
			System.out.println("Minimum element is " + minEle);
		}

	}

	public static void main(String[] args) {

		MinStack ms = new MinStack();
		ms.push(3);
		ms.push(5);
		ms.getMin();
		ms.push(2);
		ms.push(1);
		ms.push(7);
		ms.push(6);
		ms.getMin();
		ms.pop();

	}

}
