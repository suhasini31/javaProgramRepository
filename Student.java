package com.te.javabasics.collection;

import java.util.Comparator;

public class Student implements Comparator<Student> {
	int stuId;
	String stuName;
	String stuAddress;
	int stuMarks;

	public Student(int stuId, String stuName, String stuAddress, int stuMarks) {

		this.stuId = stuId;
		this.stuName = stuName;
		this.stuAddress = stuAddress;
		this.stuMarks = stuMarks;
	}

	@Override
	public String toString() {
		return "Student [stuId=" + stuId + ", stuName=" + stuName + ", stuAddress=" + stuAddress + ",stuMarks="
				+ stuMarks + "]";
	}

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return 0;
	}

}
