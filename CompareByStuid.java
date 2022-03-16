package com.te.javabasics.collection;

import java.util.Comparator;

public class CompareByStuid implements Comparator<Student> {
	@Override
	public int compare(Student o1, Student o2) {
		return o1.stuId - o2.stuId;
	}
}
