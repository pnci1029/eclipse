package org.rocation.javatest.hp;
//415
import java.util.ArrayList;
class item{
	private String name;
	private int price;
	private int count;
	item(String name, int price, int count){
		this.name = name;
		this.price = price;
		this.count = count;
	}
	public int getPrice() {
		return price;
	}
	public int getCount() {
		return count;
	}
}

class List{
	private ArrayList<item> items;

	public void List() {
		this.items = new ArrayList<item>();
	}
	
	public void add(item item) {
		items.add(item);
	}
	public void total() {
		int sum = items.get(0).getCount()*items.get(0).getPrice();
		System.out.println(sum);
	}
	
}

public class hp17_________ {
	public static void main(String[] args) {
		item i1 = new item("±è¹ä",2000, 10);
		item i2 = new item("µ·±î½º", 6000, 20);
		item i3 = new item("³Ã¸é", 5000, 100);
		
		
		
		
	}
}
