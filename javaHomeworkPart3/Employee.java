package com.pp.javaHomeworkPart3;

public class Employee {
	public String firstname;
	public String lastname;
	private int salary;
	public String position;

	// lab3 สร้าง array จาก Class Employee
	public static void main(String[] args) {
		Employee em1 = new Employee("Petch", "Pongchaiprasit", "Programer", 150000);
		Employee[] employees = new Employee[3];
		for (int i = 1; i < employees.length; i++) {
			employees[i] = new Employee("First name " + i, " Last name " + i, " Position " + i, 500 * i);
		}
		System.out.println(employees[1].firstname);
		System.out.println(employees[1].lastname);
		System.out.println(employees[1].position);
		System.out.println(employees[1].salary);
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



