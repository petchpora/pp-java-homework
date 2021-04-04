package com.pp.javaHomeworkPart4;

import java.util.ArrayList;

public class ClassCasting {
	public static void main(String[] args) {
		Programer pp = new Programer("Petch", "Pongchaiprasit", "Programer", 150000);
		Employee jo = new CEO("Joe", "Biden", "Employee", 1500000000);
		Employee dump = new Employee("Donold", "Trump", "Employee", 150);
		CEO ceo = (CEO) jo;
		// Test casting
		ceo.fire(dump); // fire() is CEO method. Former Employee cast to CEO can use CEO method.
		jo.hello();
		//
		ArrayList<Employee> empList = new ArrayList<>();
		empList.add(pp);
		empList.add(jo);
		empList.add(dump);
		System.out.println(empList);
		CEO newceo = (CEO) empList.get(1);
		Programer fed = (Programer) empList.get(0);
		newceo.hello();
		fed.hello();

		/*
		 * We didn't learn anything about Interface 
		 * so no code about that in this file.
		 */
	}

}