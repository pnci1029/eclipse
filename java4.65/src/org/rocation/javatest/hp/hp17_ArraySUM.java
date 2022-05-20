package org.rocation.javatest.hp;

import java.util.ArrayList;

class chicken {
	String name;
	int price;
	chicken(String name, int price){
		this.name =name;
		this.price = price;
	}
	String toStr() {
		return String.format("%s: %d원", this.name, this.price);
	}
	public int getPrice() {
		return price;
	}
}
public class hp17_ArraySUM {

	public static void main(String[] args) {
		chicken c0 = new chicken("후라이드" ,9900);
		chicken c1 = new chicken("로스트" ,10000);
		chicken c2 = new chicken("양념" ,11100);
		chicken c3 = new chicken("간장" ,7900);
		chicken c4 = new chicken("파닭" ,10900);
		
		ArrayList <chicken> chickengroup = new ArrayList<> ();
		
		chickengroup.add(c0);
		chickengroup.add(c1);
		chickengroup.add(c2);
		chickengroup.add(c3);
		chickengroup.add(c4);
		int sum = 0;
		
		for(int i = 0; i<chickengroup.size(); i++) {
			sum += chickengroup.get(i).getPrice();
		}
		System.out.println(sum);
	}
	
}
