package com.te.javabasics.arrays;

import java.util.Arrays;

public class ArrayDemo {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4 };
		int temp[] = new int[4];
		System.out.println("Arr=" + Arrays.toString(arr));
		System.out.println("Temp=" + Arrays.toString(temp));
		System.out.println("------------------");
		for (int i = 0; i < arr.length; i++) {
			temp[i] = arr[i];
		}
		System.out.println("Temp=" + Arrays.toString(temp));
		System.arraycopy(arr, 0, temp, 0, 2);
		System.out.println("Temp=" + Arrays.toString(temp));

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		// Iterating an array
		System.out.println("---------------");
		for (int i : arr) {
			System.out.println(i);

		}
	}

}
