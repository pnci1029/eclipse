package org.rocation.javatest.hp;

public class hp01_parse {

	public static void main(String[] args) {
		Double a = Double.parseDouble(args[0]);
		Double pi = 3.14;
		Double r = a*a*pi;
		System.out.println(r);
	}

}
