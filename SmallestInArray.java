package com.te.javabasics.arrays;

public class SmallestInArray {
public static int getSmallest(int[] a,int total) {
	int temp;
	for(int i=0;i<total;i++)
	{
		for(int j=i+1;j<total;j++)
		{
		if(a[i]>a[j])
		{
			temp = a[i];
		
		a[i]=a[j];
		a[j]=temp;
		
		}
	}
}
return a[0];
}
public static void main(String[] args) {
int a[]= {1,2,5,7,8,9};
int b[]= {99,55,76,43,87,33,88};
System.out.println("Smallest="+getSmallest(a,6));
System.out.println("Smallest=" + getSmallest(b,7));

}
}

