package com.sai;

import java.util.Scanner;

public class ZeroMatrix {
	int[][] matrix;
	int row;
	int column;

	public void create() {

		System.out.println("Matrix Creation");
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of rows");
		row = scan.nextInt();
		System.out.println("Enter the number of columns");
		column = scan.nextInt();
		System.out.println("Enter the elements ");
		matrix = new int[row][column];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {

				matrix[i][j] = scan.nextInt();
			}

		}

	}

	private void setZeros(int[][] matrix2) {
		boolean[] row = new boolean[matrix.length];
		boolean[] column = new boolean[matrix[0].length];

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				if(matrix[i][j]==0){
				row[i] = true;
				column[j] = true;
				}
			}
		}

		for (int i = 0; i < row.length; i++) {
			if (row[i]) {
				nullifyRow(matrix, i);
			}
		}
		for (int j = 0; j < column.length; j++) {
			if (column[j]) {
				nullifyColumn(matrix, j);
			}
		}

	}

	void nullifyRow(int[][] matrix2, int i) {

		for (int j = 0; j < matrix[0].length; j++) {
			matrix[i][j] = 0;
		}

	}

	void nullifyColumn(int[][] matrix2, int j) {

		for (int i = 0; i < matrix.length; i++) {
			matrix[i][j] = 0;
		}
	}

	void display() {

		System.out.println("\nThe Matrix is :");

		for (int i = 0; i < row; i++) {

			for (int j = 0; j < column; j++) {

				System.out.print(" " + matrix[i][j]);
			}
			System.out.println();
		}

	}

	public static void main(String[] args) {
		ZeroMatrix zm = new ZeroMatrix();
		zm.create();
		System.out.println("Before manipulating");
		zm.display();
		zm.setZeros(zm.matrix);
		System.out.println("After manipulating");
		zm.display();

	}

}
