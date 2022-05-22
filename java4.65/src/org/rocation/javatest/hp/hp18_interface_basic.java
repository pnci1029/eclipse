package org.rocation.javatest.hp;
class holyknight implements healer, knight{
	String name;
	int HP;
	
	holyknight(String name, int HP){
		this.name = name;
		this.HP = HP;
	}
	public void heal(holyknight target) {
		target.HP +=30;
		System.out.printf("%s의 체력을 회복합니다 HP: %d\n", this.name, target.HP);
	}
	public void healall(holyknight target) {
		target.HP +=50;
		System.out.printf("전체 체력을 회복합니다 HP: %d\n",target.HP);
	}
}
interface healer{
	public void heal(holyknight target);
}
interface knight{
	public void healall(holyknight target);
}
public class hp18_interface_basic {
	public static void main(String[] args) {

		holyknight h = new holyknight("홀리", 70);
		h.heal(h);
		h.healall(h);
		
	}
}
