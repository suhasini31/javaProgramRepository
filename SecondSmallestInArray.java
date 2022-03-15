package com.te.javabasics.arrays;

public class SecondSmallestInArray {
	public static int getSecondSmallest(int[] a, int total){
	int temp;
	for(int i=0;i<total;i++){
		for(int j=i+1;j<total;j++) {
			if(a[i]>a[j]){			
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
			
	}

return a[1]; 
}
public static void main(String[] args) {
	int a[]= {1,4,7,9,2,6};
	int b[]= {88,66,55,33,99,22,11};
	System.out.println("Second Smallest=" +getSecondSmallest(a,6));
	System.out.println("Second Smallest=" +getSecondSmallest(b,7));
	
	
}
}


