package com.pp.javaHomeworkPart4;

public class Casting {
	public static void main (String[] args) {
		//Number casting
		int thisInt = 500;
		float thisFloat = 12.34f;
		
		//the Casting
		float toFloat = thisInt;
		int toInt = (int) thisFloat;
		byte toByte = (byte) thisInt;
		
		//Log
		System.out.println("Int: "+thisInt+" and Float: "+thisFloat);
		System.out.println("From Int "+thisInt+" to Float: "+toFloat);
		System.out.println("From Float "+thisFloat+" to Int: "+toInt);
		System.out.println("From Int "+thisInt+" to Byte: "+toByte);
	}
}
