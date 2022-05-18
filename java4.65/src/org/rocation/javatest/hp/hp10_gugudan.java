package org.rocation.javatest.hp;
// 구구단
public class hp10_gugudan {

	public static void main(String[] args) {
		for(int i = 1; i<10; i++) {
			for(int j = 1; j<10; j++) {
				System.out.printf("%d단 시작: %d*%d = %d\n",i,i,j,i*j );
			}System.out.println();
		}
	}

}
