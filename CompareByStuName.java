package com.te.javabasics.collection;

import java.util.Comparator;

public class CompareByStuName implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return o1.stuName.compareTo(o2.stuName);
	}

}
