package org.rocation.javatest.hp;
import java.util.ArrayList;
import java.util.List;
// �ֻ��� ��� ������ ���� �� �迭��
class dice{
	int n;
	int rolldice() {
	int r = (int)(Math.random()*6+1);
		return r;
	}
}
public class hp14_rolldice {

	public static void main(String[] args) {
		dice a = new dice();
		dice b = new dice();
		
		int [] dicecount = new int [13];
		
		// �ֻ��� 100�� ������ ����
		for(int i = 0; i<100; i++) {
			int dicea = a.rolldice();
			int diceb = b.rolldice();
			dicecount[dicea + diceb]++;
		}
		
		for(int row = 0; row<dicecount.length; row++) {
			System.out.printf("%s: %s\n",row, dicecount[row]);
		}
		
		
	}
}
