package org.rocation.javatest.hp;

public class hp02_basic_method {

	public static void main(String[] args) {
		square(4);
	}
	
	private static void square(int r) {
			int a = r*r*r;
			System.out.printf("%dÀÇ ¼¼Á¦°ö: %d",r,a );
	}

}
