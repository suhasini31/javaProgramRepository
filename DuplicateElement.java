package com.te.javabasics.arrays;

public class DuplicateElement {
	public static void main(String[] args) {
		int [] arr=new int[] {2,3,4,5,6,3,6,8,9};
		System.out.println("Duplicate elements in given array");
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j])
					System.out.println(arr[j]);
			}
		}
	}

}
