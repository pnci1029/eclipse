package org.rocation.javatest.hp;
class main implements Developer, Instructor, Message{
	String name;
	String job;
	main(String name){
		this.name = name;
	}
	
	public void Dev(String job) {
		System.out.printf("%s, %s ��!\n", this.name, job);
	}
	public void Mes(String job) {
		System.out.printf("%s, %s ��!\n", this.name, job);
	}
	public void Ins(String job) {
		System.out.printf("%s, %s ��!\n", this.name, job);
	}
	
}
interface Developer{
	public void Dev(String job);
}

interface Message{
	public void Mes(String job);
}

interface Instructor{
	public void Ins(String job);
}

public class hp19_interface_basic2 {

	public static void main(String[] args) {
		main m1 = new main("���� ����");
		
		m1.Dev("���߰���");
		m1.Mes("������");
		m1.Ins("����");
	}

}
