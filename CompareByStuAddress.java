package com.te.javabasics.collection;

import java.util.Comparator;

public class CompareByStuAddress implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return o1.stuAddress.compareTo(o2.stuAddress);
	}

}
