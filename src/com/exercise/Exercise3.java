package com.exercise;

public class Exercise3 {
	private int area = 0;
	public int maximalSquare(int[][] matrix) {
		
		for (int i = 0; i < matrix.length; i++) {

			for (int j = 0; j < matrix[0].length; j++) {
				if (matrix[i][j] == 1) {
					calculateArea(i, j, matrix);
				}

			}

		}
		return 0;
	}

	private void calculateArea(int i1, int j1, int[][] matrix) {
		for (int i = i1; i < matrix.length-1; i++) {

			for (int j = j1; j < matrix[0].length-1; j++) {
				if (matrix[i][j] == 1 && matrix[i][j+1] != 0) {
					
				}else{
					
				}

			}

		}

	}

}
