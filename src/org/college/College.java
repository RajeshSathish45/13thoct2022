package org.college;

public class College {

	private void collegeName() {
		System.out.println("College Name = PSG");

	}
	private void collegeCode() {
		System.out.println("College Code = 4522");

	}
	
	private void collegeRank() {
		System.out.println("College Rank = 1");

	}
	public static void main(String[] args) {
		College a = new College();
		a.collegeName();
		a.collegeCode();
		a.collegeRank();
		Student b = new Student();
		b.studentName();
		b.studentDept();
		b.studentId();
		Hostel c = new Hostel();
		c.hostelName();
		Dept d = new Dept();
		d.deptName();
	}
}
