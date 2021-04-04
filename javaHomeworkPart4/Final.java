package com.pp.javaHomeworkPart4;

//Final class
final class Final {

	public static void main (String[] args) {
		//Final variable
		final String str = "This can not be change";
		System.out.println(str);
//		str = "Change me"; // Error because it can not be change.
//		System.out.println(str);
	}
	
	// Final method
	final int sum(int a, int b) {
		return a+b;
	}
}
