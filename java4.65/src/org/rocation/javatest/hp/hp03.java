package org.rocation.javatest.hp;

public class hp03 {

	public static void main(String[] args) {
		measure(2.0,3.0,4.0);
	}
	
	public static void measure(Double personal,Double face, Double ability ) {
		String [] name = {"��", "��", "��"};
		
		Double total = personal + face + ability;
			if(personal >=4.0 &&face>= 4.0 && ability>=4.0) {
				System.out.printf("%s���� A����Դϴ�.", name);
			}else if(total >=10.0 && (personal >=4.0||face>=4.0 || ability>=4.0)) {
				System.out.printf("%s���� B����Դϴ�.", name);
			}else
				System.out.printf("%s���� C����Դϴ�.",name);
			System.out.println( name[2]);
	}
	
	
}
