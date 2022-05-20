package org.rocation.javatest.hp;
import java.util.ArrayList;
//리스트 . 겟메소드 . 투스트링 매우중요!!!!!!!!!!!!!!!1 아래쪽
class ramen{
	String name;
	int price;
	ramen(String name, int price){
		this.name = name;
		this.price = price;
	}
	String toStr() {
		return String.format("%s의 가격: %d",this.name, this.price);
	}
}
public class hp15_arraylist_veryimport {
	public static void main(String[] args) {
		ramen shin = new ramen("신라면", 500);
		ramen jin = new ramen("진라면",601);
		ramen bi = new ramen("비빔면", 302);
		
		ArrayList<ramen> ragroup = new ArrayList<> ();
		ragroup.add(bi);
		ragroup.add(shin);
		ragroup.add(jin);
			
		// 리스트 . 겟메소드 . 투스트링 매우중요!!!!!!!!!!!!!!!1
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
