package org.stackroute1;

public class Member {
	private String name;
	private int age;
	private double salary;

	public Member(String name, int age, double salary) {
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	class MemberVariables {
		Member varMember = new Member("Harry Potter", 30, 2500.3);

		public String[] member(Object varMember) {
			String s = this.varMember.name + "," + this.varMember.age + "," + this.varMember.salary;
			String[] arr = s.split(",");
			return arr;
		}

		// public static void main(String[] args) {
		// varMember.display();

	}

	public void display() {
		System.out.println("Member Name: " + this.name);
		System.out.println("Member age: " + this.age);
		System.out.println("Member Salary: " + this.salary);

	}

}
