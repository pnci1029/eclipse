package org.rocation.javatest.hp;
import java.util.ArrayList;
//����Ʈ . �ٸ޼ҵ� . ����Ʈ�� �ſ��߿�!!!!!!!!!!!!!!!1 �Ʒ���
class ramen{
	String name;
	int price;
	ramen(String name, int price){
		this.name = name;
		this.price = price;
	}
	String toStr() {
		return String.format("%s�� ����: %d",this.name, this.price);
	}
}
public class hp15_arraylist_veryimport {
	public static void main(String[] args) {
		ramen shin = new ramen("�Ŷ��", 500);
		ramen jin = new ramen("�����",601);
		ramen bi = new ramen("�����", 302);
		
		ArrayList<ramen> ragroup = new ArrayList<> ();
		ragroup.add(bi);
		ragroup.add(shin);
		ragroup.add(jin);
			
		// ����Ʈ . �ٸ޼ҵ� . ����Ʈ�� �ſ��߿�!!!!!!!!!!!!!!!1
		for(int i =0; i<ragroup.size(); i ++) {
			System.out.println(ragroup.get(i).toStr());
		}
		int sum = 0;
		for(int i =0; i<ragroup.size(); i++) {
			
			sum += ragroup.get(i).price;
		}
		System.out.println(sum);
		
		
	}

}
