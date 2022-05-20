package org.rocation.javatest.hp;
class holyknight implements heal{
	String name;
	int HP;
	holyknight(String name, int HP){
		this.name= name;
		this.HP = HP;
	}
	static void healing(holyknight target) {
		target.HP +=30;
	}
}
class healer extends holyknight{
	healer(String name, int HP){
		super(name, HP);
	}
}
class knight extends holyknight{
	knight(String name, int HP){
		super(name,HP);
	}
}
interface heal{
	static void healing() {
	}
}
public class hp18 {
	public static void main(String[] args) {
	
	
	}
}
