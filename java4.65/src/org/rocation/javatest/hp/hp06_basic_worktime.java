package org.rocation.javatest.hp;

public class hp06_basic_worktime {

	public static void main(String[] args) {
		
		Double g = pay(111,11);
		System.out.println(g);
		
		
	}
	// �ñ޿� ���� �޼ҵ�
	public static double pay(int hour, int hourpay) {
		double pay = hour*hourpay;
		if(hourpay<8) {
			System.out.println("���� �ñ� �̸�!");
		}
		if(hour>60) {
			System.out.println("�ٹ� �ð� �ʰ�!");
		}
		if(hour>40) {
			pay = 320+(hour-40)*1.5*hourpay;
			} else {
				return pay;
			}
		
		return pay;
	}

}
