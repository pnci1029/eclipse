package org.rocation.javatest.hp;
// �迭 ��հ� ���ϱ�
public class hp08_basic_import {

	public static void main(String[] args) {
		Integer [] average= {1,2,3,4,5,6,7,8,9,10};
		double sum = 0;
		double avg = 0;
		for(int i =0; i<average.length; i++) {
			sum += average[i]; 
			
		}avg = sum/average.length; 
		System.out.println(avg);
	}

}
