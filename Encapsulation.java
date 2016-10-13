package com.sai;

class Calling {
	private int abc;

	public int getABC() {
		return abc;
	}

	public void setABC(int abc) {
		this.abc = abc;
	}

}

public class Encapsulation {
	public static void main(String[] args) {

		Calling e = new Calling();
		e.setABC(10);
		System.out.println(e.getABC());

	}
}