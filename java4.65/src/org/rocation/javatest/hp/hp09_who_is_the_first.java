package org.rocation.javatest.hp;

public class hp09_who_is_the_first {

	public static void main(String[] args) {
		
		String [] name = {"Elena", "Suzie", "John", "Emility", "Neda", "Kate", "Alex", "Daniel", "Hamilton"};
		Integer[] score= {65,74,23,75,68,96,88,98,54};
		
	int i = topindex(score);
		
	System.out.printf("1µÓ: %s(%d¡°)",name[i], score[i]);
		
	}
	
	public static int topindex(Integer [] arr) {
		int top = 0;
		for(int i =0; i<arr.length; i++) {
			if(arr[i]>arr[top]) {
				top = i;
			}
		} return top;
	}

}
