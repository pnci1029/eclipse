package org.rocation.javatest.hp;

public class hp06_basic_worktime {

	public static void main(String[] args) {
		
		Double g = pay(111,11);
		System.out.println(g);
		
		
	}
	// 시급에 대한 메소드
	public static double pay(int hour, int hourpay) {
		double pay = hour*hourpay;
		if(hourpay<8) {
			System.out.println("최저 시급 미만!");
		}
		if(hour>60) {
			System.out.println("근무 시간 초과!");
		}
		if(hour>40) {
			pay = 320+(hour-40)*1.5*hourpay;
			} else {
				return pay;
			}
		
		return pay;
	}

}
