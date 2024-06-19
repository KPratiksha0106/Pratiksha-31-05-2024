package com.JavaString;

public class Example1 {
	public static void main(String[] args) {
		char charValue= 'S';
		System.out.println(charValue);
		
		char name[] = {'v','e','n','k','a','t'};
		
		System.out.println(name);
		
		System.out.println(name.hashCode());

		String myName ="Venkat";//literal way of creating an object
		
		System.out.println(myName);
		
		myName.concat("Rao"
				+ "");//added new string
		System.out.println(myName.hashCode());

		
	}

}
