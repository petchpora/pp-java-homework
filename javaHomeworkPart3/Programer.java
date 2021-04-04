package com.pp.javaHomeworkPart3;

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

}
