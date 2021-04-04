package com.pp.javaHomeworkPart4;

//Enum code is here.
public class Employee {
	public String firstname;
	public String lastname;
	private int salary;
	public String position;
	public Enum.Status status;
	public Enum.Salary salary2;

	public static void main(String[] args) {	
		Employee em0 = new Employee ("Som", "Aroy", "Employee", 200);
		em0.status = Enum.Status.QUIT;
		em0.salary2 = Enum.Salary.LOW;
	}

	public Employee(String firstnameInput, String lastnameInput, String positionInput, int salaryInput) {
		this.firstname = firstnameInput;
		this.lastname = lastnameInput;
		this.position = positionInput;
		this.salary = salaryInput;
	}
	
	//Constructor Overloading
	public Employee() {
		this("Anonymous","Anonymous","none",25000);
	}

	public void hello() {
		System.out.println("Hello " + firstname);
	}

	public int getSalary() {
		return salary;
	}

	public void greetingMethod() {
		System.out.println("Greeting " + this.firstname + ". How can I help you today?");
	}	
	
	public void checkPosition() {
		System.out.println("This is my position: " +position);
	}
}



