package com.te.javabasics.collection;

import java.util.Comparator;

public class CompareByStuMarks implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return o1.stuMarks - o2.stuMarks;
	}

}
