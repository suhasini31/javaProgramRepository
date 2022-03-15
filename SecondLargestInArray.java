package com.te.javabasics.arrays;

public class SecondLargestInArray {
	public static int getSecondLargest(int[] a, int total)
	{
		int temp;
		for(int i=0;i<total;i++) {
			for(int j=i+1;j<total;j++){
				if(a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
					
			}
		}
		return a[total-2];
	}
public static void main(String[] args) {
	int a[]= {8,5,4,1,9,3};
	int b[]= {77,11,22,34,81,55,99};
	System.out.println("SecondLargest=" +getSecondLargest(a,6));
	System.out.println("Second Largest =" +getSecondLargest(b,7));
}
}
