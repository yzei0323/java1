package com.metrix_cjt;

import java.util.Arrays;

public class matrix {
	// 사용법 예시
	//	int[][] a = { 
	//			{ 1, 2 }, 
	//			{ 4, 5 }, 
	//			{ 7, 8 } };
	//	int[][] b = { 
	//			{ 1, 2, 3 }, 
	//			{ 4, 5, 6 } };
	//	int[][] c = { 
	//			{ 1 }, 
	//			{ 4 }, 
	//			{ 7 } };
	//	int[][] d = { 
	//			{ 1, 2, 3 } };
	//
	//	matrix.printMatrix(matrix.times(a, b));
	//	System.out.println("");
	//	matrix.printMatrix(matrix.times(c, d));
	
	// 행렬 출력
	public static void printMatrix(int[][] matrix) {
		if(matrix == null) {
			return;
		}
		for (int i = 0; i < matrix.length; i++) {
			System.out.print((i == 0) ? "[" : " ");
			System.out.print(Arrays.toString(matrix[i]));
			System.out.print((i == matrix.length - 1) ? "]" : ",\n");
		}
	}

	// 두 행렬의 크기가 같은지 확인
	public static boolean isSameSize(int[][] a, int[][] b) {
		if (a.length == b.length && a[0].length == b[0].length) {
			return true;
		} else {
			return false;
		}
	}

	// 두 행렬의 합
	public static int[][] add(int[][] a, int[][] b) {
		int[][] result;
		if (isSameSize(a, b)) {
			result = new int[a.length][a[0].length];
			for (int i = 0; i < result.length; i++) {
				for (int j = 0; j < result[i].length; j++) {
					result[i][j] = a[i][j] + b[i][j];
				}
			}
			return result;
		} else {
			System.out.println("행렬의 크기가 맞지 않습니다.");
			return null;
		}
	}

	// 두 행렬의 차
	public static int[][] minus(int[][] a, int[][] b) {
		int[][] result;
		if (isSameSize(a, b)) {
			result = new int[a.length][a[0].length];
			for (int i = 0; i < result.length; i++) {
				for (int j = 0; j < result[i].length; j++) {
					result[i][j] = a[i][j] - b[i][j];
				}
			}
			return result;
		} else {
			System.out.println("행렬의 크기가 맞지 않습니다.");
			return null;
		}
	}

	// 행과 열의 크기가 같은지 확인
	public static boolean isRowColumnSame(int[][] a, int[][] b) {
		if (a[0].length == b.length && b[0].length == a.length) {
			return true;
		} else {
			return false;
		}
	}

	// 두 행렬의 곱
	public static int[][] times(int[][] a, int[][] b) {
		int[][] result;
		if (isRowColumnSame(a, b)) {
			if (a.length <= b.length) {
				result = new int[a.length][b[0].length];
			} else {
				result = new int[b.length][a[0].length];
			}
			for (int i = 0; i < result.length; i++) {
				for (int j = 0; j < result[i].length; j++) {
					for (int x = 0; x < ((a.length <= b.length) ? b.length : a.length); x++) {
						result[i][j] += a[x][i] * b[j][x];
					}
				}
			}
			System.out.println("두 행렬의 곱의 값은");
			return result;
		} else {
			System.out.println("행렬의 곱셈이 가능하지 않습니다.");
			return null;
		}
	}
}
