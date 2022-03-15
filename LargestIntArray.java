package com.te.javabasics.arrays;

public class LargestIntArray {
	public static int getLargest(int[] a, int total) {
		int temp;
		for (int i = 0; i < total; i++) {
			for (int j = i + 1; j < total; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}

			}
		}
		return a[total - 1];
	}

	public static void main(String[] args) {
		int a[] = { 1, 2, 8, 9, 6, 3 };
		int b[] = { 87, 97, 86, 65, 54, 43, 32 };
		System.out.println("Largest=" + getLargest(a, 6));
		System.out.println("Largest=" + getLargest(b, 7));

	}
}
