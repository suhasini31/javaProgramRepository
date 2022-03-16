package com.te.javabasics.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class StudentTest {
	public static void main(String[] args) {
		boolean temp = true;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a Number");
		int number = scanner.nextInt();
		ArrayList<Student> arrayList = new ArrayList<Student>();
		arrayList.add(new Student(200, "Suhasini", "Banglore", 67));
		arrayList.add(new Student(300, "Thanushree", "Goa", 78));
		arrayList.add(new Student(200, "Hemamba", "Nandyal", 83));
		arrayList.add(new Student(200, "Vennela", "Hyderabad", 95));
		System.out.println("=======================");
		System.out.println(arrayList);
		do {
			System.out.println("type 1 to grt sort by id ");
			System.out.println("type 2 to grt sort by name ");
			System.out.println("type 3 to grt sort by Address ");
			System.out.println("type 4 to grt sort by marks ");
			switch (number) {
			case 1:
				System.out.println("==== sort by id ======");
				Collections.sort(arrayList, new CompareByStuid());
				for (Student student5 : arrayList) {
					System.out.println(student5);

				}
				break;
			case 2:
				System.out.println("==== sort by name ======");
				Collections.sort(arrayList, new CompareByStuName());
				for (Student student5 : arrayList) {
					System.out.println(student5);

				}
				break;
			case 3:
				System.out.println("==== sort by Address ======");
				Collections.sort(arrayList, new CompareByStuAddress());
				for (Student student5 : arrayList) {
					System.out.println(student5);

				}
				break;
			case 4:
				System.out.println("==== sort by Marks ======");
				Collections.sort(arrayList, new CompareByStuMarks());
				for (Student student5 : arrayList) {
					System.out.println(student5);
				}
				break;
			}
			System.out.println("Do you want to see Student details again");
			String string = scanner.next();
			if (string.equalsIgnoreCase("Yes")) {
				temp = true;
			} else if (string.equalsIgnoreCase("No")) {
				temp = false;
				System.out.println("exit");

			}

		} while (temp);
	}
}
