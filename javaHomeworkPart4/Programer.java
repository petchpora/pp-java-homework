package com.pp.javaHomeworkPart4;

//ทดลอง extends class ใหม่ชื่อ Programmer ไปลองสร้าง object ขึ้นมาอีกตัว

public class Programer extends Employee {
	public Programer(String firstnameInput, String lastnameInput, String positionInput, int salaryInput) {
		super(firstnameInput, lastnameInput, positionInput, salaryInput);
	}

	public void createWebsite(String templete, int productKey) {
		System.out.println("The website name's " + templete + " has been created! (Product key:" + productKey + ")");
	}

	public void installWindows(String version, int productKey) {
		System.out.println(
				"Installed Windows version \"" + version + "\" successfully! (Product key:" + productKey + ")");
	}
	
//	public void main (String[] args) {
//		createWebsite("Shoppee","4-4-2021");
//		installWindows("XP","4-4-2021");
//		
//	}

	//instance Salary in Programer class
	@Override
	public int getSalary() {
		// TODO Auto-generated method stub
		return super.getSalary() * 10;
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

	@Override
	public void hello() {
		// TODO Auto-generated method stub
		super.hello();
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

}
