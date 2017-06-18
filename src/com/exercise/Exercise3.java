package com.exercise;

public class Exercise3 {
	private int area = 0;
	int areaSquare = 1;
	int endX, endY;

	public int maximalSquare(int[][] matrix) {

		for (int i = 0; i < matrix.length - 1; i++) {

			for (int j = 0; j < matrix[0].length - 1; j++) {
				if (matrix[i][j] == 1) {
					endX = i + 1;
					endY = j +1;
					int numberArea = calculateArea(i, j, matrix);
					if (area < numberArea) {
						area = numberArea;
					}
					break;
				}

			}

		}
		return area;
	}

	// caculate aresquare
	private int calculateArea(int i1, int j1, int[][] matrix) {
		int startX = i1, startY = j1, firstCheckNumber = 0;
		for (int i=i1; i <= endX ; i++) {
			for (int j=j1; j <= endY ; j++) {
				if (matrix[i][j] == 1) {
					firstCheckNumber += 1;
					System.out.println("first"+firstCheckNumber);
				}
			}
		}

		if (firstCheckNumber == (endX - startX + 1) * (endX - startX + 1)) {
			areaSquare = firstCheckNumber;
			if (endX < matrix.length - 1 && endY < matrix[0].length-1) {
				endX++;
				endY++;
				calculateArea(startX,startY, matrix);
			}
		}
		return areaSquare;
	}

}
