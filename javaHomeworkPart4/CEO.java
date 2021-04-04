package com.pp.javaHomeworkPart4;

// ทดลอง copy class Employee, CEO, Day9 ไปรัน
public class CEO extends Employee {
	public CEO(String firstnameInput, String lastnameInput, String positionInput, int salaryInput) {
		super(firstnameInput, lastnameInput, positionInput, salaryInput);
	}

	@Override
	public int getSalary() {
		return super.getSalary() * 20;
	}

	public void hello() {
		System.out.println("Hi, nice to meet you. " + this.firstname + "!");
	}

	public void fire(Employee employee) {
		System.out.println(employee.firstname + " has been fired!");
	}

	@Override
	public void greetingMethod() {
		// TODO Auto-generated method stub
		super.greetingMethod();
	}

	@Override
	public void checkPosition() {
		// TODO Auto-generated method stub
		super.checkPosition();
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}
	
	
}