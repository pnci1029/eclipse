package org.rocation.javatest.hp;
class main implements Developer, Instructor, Message{
	String name;
	String job;
	main(String name){
		this.name = name;
	}
	
	public void Dev(String job) {
		System.out.printf("%s, %s 중!\n", this.name, job);
	}
	public void Mes(String job) {
		System.out.printf("%s, %s 중!\n", this.name, job);
	}
	public void Ins(String job) {
		System.out.printf("%s, %s 중!\n", this.name, job);
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
		main m1 = new main("나는 지금");
		
		m1.Dev("개발공부");
		m1.Mes("마사지");
		m1.Ins("교육");
	}

}
