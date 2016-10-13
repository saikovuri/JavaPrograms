package com.sai;

import java.util.*;

public class Randomizer {

	// Enqueue All random values within generated maximum range

	public static Queue<Integer> GetRandomValues() {
		Random r = new Random();
		int maxValue = r.nextInt(20) + 1;
		// Generates random range of numbers to be enqueued

		Queue<Integer> q = new LinkedList<Integer>();
		for (int i = 0; i < maxValue; i++) {
			q.add(r.nextInt(19) + 2);
		}
		// below print statement can be removed

		return q;
	}

	public static void main(String[] args) {
		Prime p = new Prime();
		Queue<QueuePair> q = p.GetRandomPrimeValues();
		for (QueuePair qp : q)
			System.out.println(qp.data + " ," + qp.isPrime);
	}

}

class QueuePair {
	int data;
	boolean isPrime;

	QueuePair(int data, boolean isPrime) {
		this.data = data;
		this.isPrime = isPrime;
	}
}

class Prime {

	// Method to return Queue(random number, isPrime) of generated random
	// numbers and check if its prime or not
	public Queue<QueuePair> GetRandomPrimeValues() {
		Queue<Integer> q = Randomizer.GetRandomValues();
		Queue<QueuePair> qp = new LinkedList<QueuePair>();
		for (int i : q) {
			int notPrime = 0;
			for (int j = 2; j <= i / 2; j++) {
				if (i % j == 0) {
					notPrime = 1;
					break;
				}
			}
			if (notPrime == 0 || i == 2) {
				qp.add(new QueuePair(i, true));
			} else {
				qp.add(new QueuePair(i, false));
			}
		}
		return qp;

	}
}