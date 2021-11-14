package org.student;

import org.department.Department;

public class Student extends Department {

	public void studentName() {
		System.out.println("Printing student name");

	}

	public void studentDept() {
		System.out.println("Printing student department");

	}

	public void studentId() {
		System.out.println("Printing student ID");

	}
	
	public static void main(String[] args) {
		
		Student stu = new Student();
		
		stu.studentDept();
		stu.studentId();
		stu.studentName();
		
		stu.deptName();
		
		
		stu.collegeName();
		stu.collegeCode();
		stu.collegeRank();
		
		
	}

}
