package org.rocation.javatest.hp;
class flyable{
	String name;
	flyable(String name){
		this.name = name;
	}
	public void fly(flyable name){
	}
}
class bird extends flyable{
	bird(String name){
		super(name);
	}
	public void fly(flyable name){
	System.out.printf("[%s]�� ���ư��ϴ�.",this.name);
	}
}
class helicoptor extends flyable{
	helicoptor(String name){
		super(name);
	}
	public void fly(flyable name) {
		System.out.printf("[%s]�� ���ư��ϴ�.",this.name);
	}
}
class rocket extends flyable{
	rocket(String name){
		super(name);
	}
	public void fly(flyable name) {
		System.out.printf("[%s]�� ���ư��ϴ�.",this.name);
	}
}
public class hp20_interface_basic3 {

	public static void main(String[] args) {
		flyable b = new bird("��");
		flyable h = new helicoptor("�︮����");
		flyable r = new rocket("����");
		
		b.fly(b);
		h.fly(h);
		r.fly(r);
		
	}
}
